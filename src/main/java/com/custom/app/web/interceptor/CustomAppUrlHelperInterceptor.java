/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Url转换助手拦截器
 * 用于最外层的拦截，将url转换成本系统合法的Url
 * @author wb-tianzd
 * @version $Id: CustomAppUrlHelperInterceptor.java, v 0.1 2013-1-21 下午02:30:11 wb-tianzd Exp $
 */
public class CustomAppUrlHelperInterceptor implements HandlerInterceptor {

    /** 
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse respose,
                                Object obj, Exception ex) throws Exception {

    }

    /** 
     * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse respose, Object obj,
                           ModelAndView arg3) throws Exception {
    }

    /** 
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse respose, Object obj)
                                                                                                 throws Exception {
        return false;
    }

}
