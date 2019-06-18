package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 3:17 PM
 * @description:
 */
public interface IRoleEntity extends RecordCreatorEntity, RecordModifierEntity, GenericEntity<String> {


    String getNameFirstSpell();

    void setNameFirstSpell(String nameFirstSpell);

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getComments();

    void setComments(String comments);

    String getTenantId();

    void setTenantId(String tenantId);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    Long getShowOrder();

    void setShowOrder(Long showOrder);

    String getSystemId();

    void setSystemId(String systemId);

    Integer getIsPublic();

    void setIsPublic(Integer isPublic);

    String getUnitId();

    void setUnitId(String unitId);

    int hashCode();

    boolean equals(Object obj);

    String getCodeId();

    void setCodeId(String codeId);

    String getCodeName();

    void setCodeName(String codeName);

}
