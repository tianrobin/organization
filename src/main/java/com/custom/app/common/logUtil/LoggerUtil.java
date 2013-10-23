/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.logUtil;

import java.text.MessageFormat;

import org.apache.log4j.Logger;

/**
 * ģ���ӡ��־������
 * @author wb-tianzd
 * @version $Id: LoggerUtil.java, v 0.1 2013-1-16 ����05:14:10 wb-tianzd Exp $
 */
public class LoggerUtil {
    /**
     * <p>���ɵ��Լ�����־</p>
     * <p>
     * ���ݴ���������־ģ��Ͳ������ϣ�����debug������־
     * ����������־ģ������{����}��ʾ���滻Ϊ��������־�㣬��a={0}����ʾ�ò���������indexΪ0�Ĳ����滻{0}��
     * </p>
     * @param logger        logger����
     * @param template      ����������־ģ��
     * @param parameters    ��������
     */
    public static void debug(Logger logger, String template, Object... parameters) {
        if (logger.isDebugEnabled()) {
            logger.debug(MessageFormat.format(template, parameters));
        }
    }

    /**
     * <p>����֪ͨ������־</p>
     * <p>
     * ���ݴ���������־ģ��Ͳ������ϣ�����info������־
     * ����������־ģ������{����}��ʾ���滻Ϊ��������־�㣬��a={0}����ʾ�ò���������indexΪ0�Ĳ����滻{0}��
     * </p>
     * @param logger        logger����
     * @param template      ����������־ģ��
     * @param parameters    ��������
     */
    public static void info(Logger logger, String template, Object... parameters) {
        if (logger.isInfoEnabled()) {
            logger.info(MessageFormat.format(template, parameters));
        }
    }

    /**
     * <p>���ɾ��漶����־</p>
     * <p>
     * ���ݴ���������־ģ��Ͳ������ϣ�����warn������־
     * ����������־ģ������{����}��ʾ���滻Ϊ��������־�㣬��a={0}����ʾ�ò���������indexΪ0�Ĳ����滻{0}��
     * </p>
     * @param logger        logger����
     * @param template      ����������־ģ��
     * @param parameters    ��������
     */
    public static void warn(Logger logger, String template, Object... parameters) {
        logger.warn(MessageFormat.format(template, parameters));
    }

    /**
     * <p>���ɾ��漶����־</p>
     * <p>
     * ���ݴ���������־ģ��Ͳ������ϣ�����warn������־
     * ����������־ģ������{����}��ʾ���滻Ϊ��������־�㣬��a={0}����ʾ�ò���������indexΪ0�Ĳ����滻{0}��
     * </p>
     * @param e             �����쳣��ջ
     * @param logger        logger����
     * @param template      ����������־ģ��
     * @param parameters    ��������
     */
    public static void warn(Throwable e, Logger logger, String template, Object... parameters) {
        logger.warn(MessageFormat.format(template, parameters), e);
    }

    /**
     * <p>���ɴ��󼶱���־</p>
     * <p>
     * ���ݴ���������־ģ��Ͳ������ϣ�����error������־
     * ����������־ģ������{����}��ʾ���滻Ϊ��������־�㣬��a={0}����ʾ�ò���������indexΪ0�Ĳ����滻{0}��
     * </p>
     * @param e             �����쳣��ջ
     * @param logger        logger����
     * @param template      ����������־ģ��
     * @param parameters    ��������
     */
    public static void error(Throwable e, Logger logger, String template, Object... parameters) {
        logger.error(MessageFormat.format(template, parameters), e);
    }

    /**
     * <p>���ɴ��󼶱���־</p>
     * <p>
     * ���ݴ���������־ģ��Ͳ������ϣ�����error������־
     * ����������־ģ������{����}��ʾ���滻Ϊ��������־�㣬��a={0}����ʾ�ò���������indexΪ0�Ĳ����滻{0}��
     * </p>
     * @param logger        logger����
     * @param template      ����������־ģ��
     * @param parameters    ��������
     */
    public static void error(Logger logger, String template, Object... parameters) {
        logger.error(MessageFormat.format(template, parameters));
    }
}
