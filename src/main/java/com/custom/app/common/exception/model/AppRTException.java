/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.exception.model;

import java.text.MessageFormat;

/**
 * �Զ�������ʱ�쳣
 * @author wb-tianzd
 * @version $Id: AppRTException.java, v 0.1 2013-1-16 ����05:27:32 wb-tianzd Exp $
 */
public class AppRTException extends RuntimeException {

    /**  */
    private static final long serialVersionUID = -3632018787987357654L;

    /**
     * �쳣��
     */
    private String            code;

    /**
     * �쳣��������
     */
    private String[]          args;

    /**
     * �ı���Ϣ
     */
    private String            textMessage;

    /**
     * �쳣������������
     * @param cause �쳣����
     * @param code ���쳣������
     * @param msg  ���쳣������Ϣ
     */
    public AppRTException(Throwable cause, String code, String msg) {
        super(code + ": " + msg, cause);
        this.code = code;
        this.textMessage = msg;
    }

    /**
     * �쳣������������
     * @param cause �쳣����
     * @param code ���쳣������
     * @param msg  ���쳣������Ϣ 
     * @param args �ֳ���Ϣ�����ⲿ������
     */
    public AppRTException(Throwable cause, String code, String msg, String... args) {
        super(code + ": " + formatMessage(msg, args), cause);
        this.code = code;
        this.args = args;
        this.textMessage = msg;
    }

    /**
     * �������쳣�����
     * @param code ���쳣������
     * @param msg  ���쳣������Ϣ 
     */
    public AppRTException(String code, String msg) {
        super(code + ": " + msg);
        this.code = code;
        this.textMessage = msg;
    }

    /**
     *  �������쳣�����
     * @param code ������
     * @param msg  ������Ϣ 
     * @param args �ֳ���Ϣ�����ⲿ������
     */
    public AppRTException(String code, String msg, String... args) {
        super(code + ": " + formatMessage(msg, args));
        this.code = code;
        this.args = args;
        this.textMessage = msg;
    }

    /**
     * ��ʽ��msg˽�з���
     * @param msg  ������Ϣ 
     * @param args �ֳ���Ϣ�����ⲿ������
     * @return      ��ʽ���������Ϣ���ַ���
     */
    private static String formatMessage(String msg, String[] args) {
        if (args == null) {
            return msg;
        }
        Object[] object = castStrArraysToObjectArrays(args);
        return MessageFormat.format(msg, object);
    }

    /**
     * ��string����תΪ��������
     * @param args  string����
     * @return      ��������
     */
    private static Object[] castStrArraysToObjectArrays(String[] args) {
        Object[] object = new Object[args.length];
        for (int i = 0; i < args.length; ++i) {
            object[i] = args[i];
        }
        return object;
    }

    /**
     * �õ�������
     * @return code ������
     */
    public String getCode() {
        return code;
    }

    /**
     * �õ��ֳ���Ϣֵ���飺�� �ⲿ������
     * 
     * @return �õ��ֳ���Ϣֵ���� 
     */
    public String[] getArgs() {
        return args;
    }

    /**
     * �õ���ʾ��Ϣģ��
     * 
     * @return  ��ʾ��Ϣģ��
     */
    public String getTextMessage() {
        return textMessage;
    }

    /**
     * Setter method for property <tt>args</tt>.
     * 
     * @param args value to be assigned to property args
     */
    public void setArgs(String[] args) {
        this.args = args;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Setter method for property <tt>textMessage</tt>.
     * 
     * @param textMessage value to be assigned to property textMessage
     */
    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    /** 
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return formatMessage(this.textMessage, this.args);
    }

}
