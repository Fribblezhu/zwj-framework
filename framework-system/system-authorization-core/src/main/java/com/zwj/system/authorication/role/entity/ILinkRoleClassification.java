package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.GenericEntity;



/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 10:58 AM
 * @description:
 */
public interface ILinkRoleClassification extends GenericEntity<String> {

    String getRoleId();

    void setRoleId(String roleId);

    String getRoleclassId();

    void setRoleclassId(String roleclassId);

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
