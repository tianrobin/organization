/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2013 All Rights Reserved.
 */
package com.custom.app.common.model;

/**
 * <p>ö�ٶ���ӿ�</p>
 * �淶Ҫ��<p>����ö��enum����Ҫimplements�ýӿ�</p>
 *          <p>����ö�ٶ����嵽�ð����棬�����½������з���</p>
 * @author wb-tianzd
 * @version $Id: BaseEnum.java, v 0.1 2013-3-18 ����03:19:45 wb-tianzd Exp $
 */
public interface BaseEnum {

    /**
     * <p>��ȡcode</p>
     * <p>ÿ��enum��������ʵ�ָýӿڷ�����������enum���ֹ���д</p>
     * @return  code
     */
    String name();

    /**
     * <p>��ȡö������</p>
     * @return  code����
     */
    String getDesc();
}
