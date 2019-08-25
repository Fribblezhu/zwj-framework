package com.zwj.system.authorication.code.entity;

import com.zwj.framework.common.entity.GenericEntity;

import java.util.Set;


/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 3:17 PM
 * @description:
 */
public interface ICodeEntity extends   GenericEntity<String> {

    Integer getIsSystem();

    void setIsSystem(Integer isSystem);

    String getParentId();

    void setParentId(String parentId);

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    Integer getStatus();

    void setStatus(Integer status);

    String getDescription();

    void setDescription(String comments);

    Integer getIsVirtual();

    void setIsVirtual(Integer isVirtual);

    Integer getIsGroup();

    void setIsGroup(Integer isGroup);

    String getGroupKey();

    void setGroupKey(String groupKey);

    String getTenantId();

    void setTenantId(String tenantId);

    void setCodecList(Set<CodecEntity> codecList);

    Set<CodecEntity> getCodecList();

}
