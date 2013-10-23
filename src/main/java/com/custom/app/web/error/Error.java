/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.web.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������ҳ�������
 * @author wb-tianzd
 * @version $Id: Error.java, v 0.1 2013-1-16 ����06:45:41 wb-tianzd Exp $
 */
@Controller
public class Error {
    /**
     * <p>��Ⱦ��ͨ����ҳ��</p>
     * @param modelMap
     * @param request
     */
    @RequestMapping(value = "/error.html")
    public void renderError(ModelMap modelMap, HttpServletRequest request) {
        initModelMap(modelMap, request);
    }

    /**
     * <p>��ҳ����������</p>
     * @param modelMap
     * @param request
     */
    private void initModelMap(ModelMap modelMap, HttpServletRequest request) {
        String errorCode = request.getParameter("ERROR_CODE");
        modelMap.addAttribute("ERROR_CODE", errorCode);
    }
}
