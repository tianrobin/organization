/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.logUtil;

import java.text.MessageFormat;

import org.apache.log4j.Logger;

/**
 * 模板打印日志工具类
 * @author wb-tianzd
 * @version $Id: LoggerUtil.java, v 0.1 2013-1-16 下午05:14:10 wb-tianzd Exp $
 */
public class LoggerUtil {
    /**
     * <p>生成调试级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成debug级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void debug(Logger logger, String template, Object... parameters) {
        if (logger.isDebugEnabled()) {
            logger.debug(MessageFormat.format(template, parameters));
        }
    }

    /**
     * <p>生成通知级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成info级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void info(Logger logger, String template, Object... parameters) {
        if (logger.isInfoEnabled()) {
            logger.info(MessageFormat.format(template, parameters));
        }
    }

    /**
     * <p>生成警告级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成warn级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void warn(Logger logger, String template, Object... parameters) {
        logger.warn(MessageFormat.format(template, parameters));
    }

    /**
     * <p>生成警告级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成warn级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param e             错误异常堆栈
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void warn(Throwable e, Logger logger, String template, Object... parameters) {
        logger.warn(MessageFormat.format(template, parameters), e);
    }

    /**
     * <p>生成错误级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成error级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param e             错误异常堆栈
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void error(Throwable e, Logger logger, String template, Object... parameters) {
        logger.error(MessageFormat.format(template, parameters), e);
    }

    /**
     * <p>生成错误级别日志</p>
     * <p>
     * 根据带参数的日志模板和参数集合，生成error级别日志
     * 带参数的日志模板中以{数字}表示待替换为变量的日志点，如a={0}，表示用参数集合中index为0的参数替换{0}处
     * </p>
     * @param logger        logger引用
     * @param template      带参数的日志模板
     * @param parameters    参数集合
     */
    public static void error(Logger logger, String template, Object... parameters) {
        logger.error(MessageFormat.format(template, parameters));
    }
}
