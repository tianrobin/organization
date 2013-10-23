/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.custom.app.common.exception.model.AppBizException;
import com.custom.app.common.exception.model.AppErrCodeEnums;
import com.custom.app.common.exception.model.AppRTException;
import com.custom.app.common.logUtil.LoggerUtil;

/**
 * 外层异常处理器
 * @author wb-tianzd
 * @version $Id: AppWebExceptionResolver.java, v 0.1 2013-1-15 下午03:23:41 wb-tianzd Exp $
 */
public class AppWebExceptionResolver implements HandlerExceptionResolver {
    /**logger */
    Logger logger = Logger.getLogger(AppWebExceptionResolver.class);

    /** 
     * @see org.springframework.web.servlet.HandlerExceptionResolver#resolveException(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
                                         Object obj, Exception exception) {
        /********************************************************
         * 没有将错误码配置到资源素文件中
         ********************************************************/
        String errorCode = AppErrCodeEnums.ERR_SYS_UNKNOWN.name();
        String errorMsg = AppErrCodeEnums.ERR_SYS_UNKNOWN.getDesc();
        if (exception instanceof AppBizException) {
            AppBizException bizE = (AppBizException) exception;
            LoggerUtil.error(bizE, logger, "业务异常，错误码{0}", exception.getMessage());
        } else if (exception instanceof AppRTException) {
            AppRTException rtE = (AppRTException) exception;
            LoggerUtil.error(rtE, logger, "系统异常，错误码{0}", exception.getMessage());
        } else {
            AppRTException rtE = new AppRTException(AppErrCodeEnums.ERR_SYS_UNKNOWN.name(),
                AppErrCodeEnums.ERR_SYS_UNKNOWN.getDesc());
            LoggerUtil.error(rtE, logger, "未处理过的系统异常，错误码{0}", exception.getMessage());
        }

        /*********************************************************
         * 构建ModelAndView
         ********************************************************/
        ModelAndView modelandview = new ModelAndView();
        request.setAttribute("ERROR_CODE", errorCode);
        request.setAttribute("ERROR_MSG", errorMsg);
        modelandview.setViewName("forward:/error.htm");
        return modelandview;
    }
}
