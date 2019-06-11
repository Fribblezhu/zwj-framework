package com.zwj.framework.common.entity;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 8:30 PM
 * @description:
 */
public interface RecordModifierEntity<ID> extends GenericEntity<ID>{

    String getModifierId();

    Date getModifyTime();

    void setModifierId(String modifierId);

    void setModifyTime(Date Date);

}
