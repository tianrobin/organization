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
 * ����쳣������
 * @author wb-tianzd
 * @version $Id: AppWebExceptionResolver.java, v 0.1 2013-1-15 ����03:23:41 wb-tianzd Exp $
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
         * û�н����������õ���Դ���ļ���
         ********************************************************/
        String errorCode = AppErrCodeEnums.ERR_SYS_UNKNOWN.name();
        String errorMsg = AppErrCodeEnums.ERR_SYS_UNKNOWN.getDesc();
        if (exception instanceof AppBizException) {
            AppBizException bizE = (AppBizException) exception;
            LoggerUtil.error(bizE, logger, "ҵ���쳣��������{0}", exception.getMessage());
        } else if (exception instanceof AppRTException) {
            AppRTException rtE = (AppRTException) exception;
            LoggerUtil.error(rtE, logger, "ϵͳ�쳣��������{0}", exception.getMessage());
        } else {
            AppRTException rtE = new AppRTException(AppErrCodeEnums.ERR_SYS_UNKNOWN.name(),
                AppErrCodeEnums.ERR_SYS_UNKNOWN.getDesc());
            LoggerUtil.error(rtE, logger, "δ�������ϵͳ�쳣��������{0}", exception.getMessage());
        }

        /*********************************************************
         * ����ModelAndView
         ********************************************************/
        ModelAndView modelandview = new ModelAndView();
        request.setAttribute("ERROR_CODE", errorCode);
        request.setAttribute("ERROR_MSG", errorMsg);
        modelandview.setViewName("forward:/error.htm");
        return modelandview;
    }
}
