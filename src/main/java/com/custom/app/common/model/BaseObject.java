package com.custom.app.common.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * <p>���������</p>
 * <p>���ж��󶼱���Ҫ�̳д���</p>
 * @author wb-tianzd
 * @version $Id: BaseObject.java, v 0.1 2013-3-18 ����03:15:15 wb-tianzd Exp $
 */
public class BaseObject {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
