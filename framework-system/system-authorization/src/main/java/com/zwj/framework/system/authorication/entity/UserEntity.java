package com.zwj.framework.system.authorication.entity;

import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:14 AM
 * @description:
 */
public interface UserEntity extends RecordCreatorEntity, RecordModifierEntity {

    String getUsername();

    void setUsername(String username);

    String getName();

    void setName(String name);

    String getPassword();

    void setPassword(String password);

    String getSalt();

    void setSalt(String salt);

    byte getStatus();

    void setStatus(byte status);

}
