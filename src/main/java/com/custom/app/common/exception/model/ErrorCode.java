/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.exception.model;

/**
 * <p>������ӿ�</p>
 * <p>���д�����enum����Ҫimplements�ýӿ�</p>
 * @author wb-tianzd
 * @version $Id: ErrorCode.java, v 0.1 2013-1-16 ����05:16:40 wb-tianzd Exp $
 */
public interface ErrorCode {
    /**
     * <p>��ȡ������</p>
     * <p>ÿ��enum��������ʵ�ָýӿڷ�����������enum���ֹ���д</p>
     * @return  ������
     */
    String name();

    /**
     * <p>��ȡ����������</p>
     * @return  ����������
     */
    String getDesc();
}
