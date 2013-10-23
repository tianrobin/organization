/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.exception.model;

/**
 * ϵͳ�����붨��ö��
 * @author wb-tianzd
 * @version $Id: AppErrCodeEnums.java, v 0.1 2013-1-16 ����05:13:09 wb-tianzd Exp $
 */
public enum AppErrCodeEnums implements ErrorCode {

    //    ##������Ϣά�Ȼ���
    //    #1��          ERR
    //    #====================== ϵͳ�쳣 ======================
    //    #2��ϵͳ�쳣  ERR_SYS
    //    #3��ϵͳ�쳣  ERR_SYS_UNKNOWN  δ֪ϵͳ����
    //    #3��ϵͳ�쳣  ERR_SYS_NET      δ֪�������

    //
    //    #====================== ҵ���쳣 ======================
    //    #2��ҵ���쳣  ERR_BIZ
    /** ϵͳ�쳣 */
    SYS_ERROR("ϵͳ�쳣"),

    /**  δ֪ϵͳ����     */
    ERR_SYS_UNKNOWN("δ֪ϵͳ����"),

    /** δ֪�������   */
    ERR_SYS_NET("δ֪�������"),

    /** û�з���Ȩ��   */
    ERR_SYS_NOT_ACCESS("û�з���Ȩ��"),

    /** �����ϵͳ  */
    ERR_SYS_USER_NOT_LOGIN("�����ϵͳ"),

    /** �Ƿ���URL����  */
    ERR_SYS_ILLEGAL_URL("�Ƿ���URL����"),

    ;

    /** ���������� */
    private String desc;

    /**
     * ��ʼ������
     * @param desc ��������
     */
    AppErrCodeEnums(String desc) {
        this.desc = desc;
    }

    /**
     * ��ȡ��������Ӧ���� 
     * @see com.custom.app.common.exception.model.ErrorCode.app.common.exception.model.ErrorCode#getDesc()
     */
    public String getDesc() {
        return desc;
    }

}
