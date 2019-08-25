package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.GenericEntity;



/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 11:00 PM
 * @description:
 */
public interface IOrganizationGradeEntity extends   GenericEntity<String> {
    String getName();

    void setName(String name);

    String getValue();

    void setValue(String value);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    String getTenantId();

    void setTenantId(String tenantId);

}
