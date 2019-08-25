package com.zwj.system.authorication.user.entity;

import com.zwj.framework.common.entity.GenericEntity;


import com.zwj.system.authorication.role.entity.RoleEntity;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 10:37 AM
 * @description:
 */
public interface ILinkUserRoleEntity extends GenericEntity<String>{

     Integer getIsTemporary();
     void setIsTemporary(Integer isTemporary);
     Date getStartDate();

     void setStartDate(Date startDate);

     Date getEndDate();

     void setEndDate(Date endDate);

     String getTenantId();

     void setTenantId(String tenantId);

     Integer getStatus();

     void setStatus(Integer status);

     Integer getApprovalStatus();

     void setApprovalStatus(Integer approvalStatus);

     Long getShowOrder();

     void setShowOrder(Long showOrder);

     String getOrganizeId();

     void setOrganizeId(String organizeId);

     UserEntity getUserEntity();

     void setUserEntity(UserEntity userEntity);

     RoleEntity getRoleEntity();

     void setRoleEntity(RoleEntity roleEntity);

}
