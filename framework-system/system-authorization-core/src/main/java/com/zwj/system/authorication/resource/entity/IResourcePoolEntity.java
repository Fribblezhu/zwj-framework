package com.zwj.system.authorication.resource.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.SortSupportEntity;
import com.zwj.framework.common.entity.TreeSupportEntity;


import java.sql.Timestamp;
import java.util.Set;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 5:34 PM
 * @description:
 */
public interface IResourcePoolEntity extends   GenericEntity<String>, SortSupportEntity {

    String getComments();

    void setComments(String comments);

    String getTenantId();

    void setTenantId(String tenantId);

    Integer getStatus();

    void setStatus(Integer status);

    String getName();

    void setName(String name);
}
