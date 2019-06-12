package com.zwj.framework.common.entity;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 8:20 PM
 * @description:
 */
public interface RecordCreatorEntity extends Entity{

    String getCreatorId();

    Date getCreateTime();

    void setCreatorId(String creatorId);

    void setCreateTime(Date date);

}
