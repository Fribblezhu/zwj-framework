package com.zwj.framework.common.entity;

import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 12:31 PM
 * @description:
 */
public interface GenericEntity<PK> extends Entity {

    PK getId();

    void setId(PK pk);

    String getModifierId();

    Timestamp getModifyTime();

    void setModifierId(String modifierId);

    void setModifyTime(Timestamp Date);

    String getCreatorId();

    Timestamp getCreateTime();

    void setCreatorId(String creatorId);

    void setCreateTime(Timestamp date);

}
