package com.zwj.system.authorication.code.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 3:17 PM
 * @description:
 */
public interface ICodeEntity extends RecordModifierEntity, RecordCreatorEntity, GenericEntity<String> {

    String getSysDefault();

    void setSysDefault(String sysDefault);

    String getParentId();

    void setParentId(String parentId);

    String getName();

    void setName(String name);

    String getCodeKey();

    void setCodeKey(String codeKey);

    Integer getStatus();

    void setStatus(Integer status);

    String getComments();

    void setComments(String comments);

    Integer getShowOrder();

    void setShowOrder(Integer showOrder);

    Integer getIsVirtual();

    void setIsVirtual(Integer isVirtual);

    Integer getIsGroup();

    void setIsGroup(Integer isGroup);

    String getGroupKey();

    void setGroupKey(String groupKey);

    String getTenantId();

    void setTenantId(String tenantId);

}
