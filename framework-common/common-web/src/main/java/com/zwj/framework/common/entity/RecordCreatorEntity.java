package com.zwj.framework.common.entity;

import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 8:20 PM
 * @description:
 */
public interface RecordCreatorEntity extends Entity{

    String getCreatorId();

    Timestamp getCreateTime();

    void setCreatorId(String creatorId);

    void setCreateTime(Timestamp date);

}
