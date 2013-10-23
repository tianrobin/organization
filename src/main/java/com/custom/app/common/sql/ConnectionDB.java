/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.apache.log4j.Logger;

import com.custom.app.common.logUtil.LoggerUtil;

/**
 * 数据库连接管理
 * @author wb-tianzd
 * @version $Id: Connection.java, v 0.1 2013-5-6 下午04:40:13 wb-tianzd Exp $
 */
public class ConnectionDB {
    private final Logger      logger = Logger.getLogger(ConnectionDB.class);
    private static Connection conn   = null;
    private static Statement  stmt   = null;
    private static ResultSet  rs     = null;

    /**
     * 连接数据库
     */
    public ConnectionDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
            stmt = conn.createStatement(1005, 1008);
        } catch (ClassNotFoundException e) {
            LoggerUtil.error(e, logger, "数据库驱动错误！{0}", e);
        } catch (SQLException e) {
            LoggerUtil.error(e, logger, "数据库连接失败！conn={0}", conn);
        }
    }

    public int executeUpdate(String sql) throws SQLException {
        Assert.assertTrue("SQL语句不能为空!", !("".equals(sql) || null == sql));
        return stmt.executeUpdate(sql);
    }

    public boolean execut(String sql) throws SQLException {
        Assert.assertTrue("SQL语句不能为空!", !("".equals(sql) || null == sql));
        return stmt.execute(sql);
    }

    public List<Map<String, String>> executeQuery(String sql) throws SQLException {
        Assert.assertTrue("SQL语句不能为空!", !("".equals(sql) || null == sql));
        List<Map<String, String>> resultes = new ArrayList<Map<String, String>>();
        rs = stmt.executeQuery(sql);
        ResultSetMetaData metadata = rs.getMetaData();
        while (rs.next()) {
            Map<String, String> resultSet = new HashMap<String, String>();
            for (int i = 1; i <= metadata.getColumnCount(); i++) {
                resultSet.put(metadata.getColumnLabel(i), rs.getString(metadata.getColumnLabel(i)));
            }
            resultes.add(resultSet);
        }
        return resultes;
    }

    public void Close() {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
            LoggerUtil.error(e, logger, "数据库链接关闭错误错误！{0}", e);
        }
    }

}
