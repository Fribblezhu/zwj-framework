package com.zwj.framework.system.authorication.entity;

import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:28 AM
 * @description:
 */
public interface RoleEntity extends RecordCreatorEntity, RecordModifierEntity{

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    byte getStatus();

    void setStatus(byte status);

}
