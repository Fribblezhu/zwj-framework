package com.zwj.framework.common.entity;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 8:20 PM
 * @description:
 */
public interface RecordCreatorEntity<ID> extends GenericEntity<ID>{

    String getCreatorId();

    Date getCreateTime();

    void setCreatorId(String creatorId);

    void setCreateTIme(Date date);

}
