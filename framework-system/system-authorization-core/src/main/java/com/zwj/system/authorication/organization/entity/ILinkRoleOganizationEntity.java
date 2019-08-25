package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.GenericEntity;



/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 11:20 AM
 * @description:
 */
public interface ILinkRoleOganizationEntity extends   GenericEntity<String> {

    String getRoleId();

    void setRoleId(String roleId);

    String getOrgId();

    void setOrgId(String orgId);

    Integer getStatus();

    void setStatus(Integer status);

    String getTenantId();

    void setTenantId(String tenantId);

    Long getShowOrder();

    void setShowOrder(Long showOrder);

}
