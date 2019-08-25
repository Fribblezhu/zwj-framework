package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.GenericEntity;



/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 2:51 PM
 * @description:
 */
public interface ILinkRoleResourceEntity extends   GenericEntity<String> {

    String getRoleId();

    void setRoleId(String roleId);

    String getResourceId();

    void setResourceId(String resourceId);

    String getTenantId();

    void setTenantId(String tenantId);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    Long getShowOrder();

    void setShowOrder(Long showOrder);

    String getUnitId();

    void setUnitId(String unitId);


}
