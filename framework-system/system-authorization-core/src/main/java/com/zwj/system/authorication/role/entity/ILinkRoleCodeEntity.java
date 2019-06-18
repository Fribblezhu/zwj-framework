package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;
import com.zwj.system.authorication.code.entity.CodeEntity;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 2:28 PM
 * @description:
 */
public interface ILinkRoleCodeEntity extends RecordCreatorEntity, RecordModifierEntity, GenericEntity<String> {

    RoleEntity getRoleEntity();

    void setRoleEntity(RoleEntity roleEntity);

    CodeEntity getCodeEntity();

    void setCodeEntity(CodeEntity codeEntity);

    Integer getStatus();

    void setStatus(Integer status);

    String getComments();

    void setComments(String comments);

    String getTenantId();

    void setTenantId(String tenantId);

    Long getShowOrder();

    void setShowOrder(Long showOrder);

}
