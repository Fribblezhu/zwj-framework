package com.zwj.framework.common.entity;

import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 8:30 PM
 * @description:
 */
public interface RecordModifierEntity extends Entity{

    String getModifierId();

    Timestamp getModifyTime();

    void setModifierId(String modifierId);

    void setModifyTime(Timestamp Date);

}
