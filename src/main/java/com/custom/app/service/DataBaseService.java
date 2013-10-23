/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.service;

import java.util.List;
import java.util.Map;

import com.custom.app.common.exception.model.AppBizException;

/**
 * ���ݿ����
 * @author wb-tianzd
 * @version $Id: DataBaseService.java, v 0.1 2013-8-30 ����03:42:52 wb-tianzd Exp $
 */
public interface DataBaseService {

    public List<Map<String, String>> getDate(String sql) throws AppBizException;

}
