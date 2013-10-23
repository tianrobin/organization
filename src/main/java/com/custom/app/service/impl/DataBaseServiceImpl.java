/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.custom.app.common.exception.model.AppBizException;
import com.custom.app.common.exception.model.AppErrCodeEnums;
import com.custom.app.common.logUtil.LoggerUtil;
import com.custom.app.common.sql.ConnectionDB;
import com.custom.app.service.DataBaseService;

/**
 * 
 * @author wb-tianzd
 * @version $Id: DataBaseServiceImpl.java, v 0.1 2013-8-30 下午03:57:07 wb-tianzd Exp $
 */
public class DataBaseServiceImpl implements DataBaseService {
    private final Logger logger = Logger.getLogger(DataBaseServiceImpl.class);
    private ConnectionDB connectionDB;

    /** 
     * @throws AppBizException 
     * @see com.custom.app.service.DataBaseService#getDate(java.lang.String)
     */
    public List<Map<String, String>> getDate(String sql) throws AppBizException {
        try {
            return connectionDB.executeQuery(sql);
        } catch (SQLException e) {
            LoggerUtil.error(logger, "数据库查询失败sql=", sql);
            throw new AppBizException(AppErrCodeEnums.SYS_ERROR.name(), AppErrCodeEnums.SYS_ERROR
                .getDesc());
        } finally {
            connectionDB.Close();
        }
    }

    /**
     * Setter method for property <tt>connectionDB</tt>.
     * 
     * @param connectionDB value to be assigned to property connectionDB
     */
    public void setConnectionDB(ConnectionDB connectionDB) {
        this.connectionDB = connectionDB;
    }

}
