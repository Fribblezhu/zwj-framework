package com.zwj.system.authorication.resource.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.SortSupportEntity;

import java.util.Set;


/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 4:39 PM
 * @description:
 */
public interface IResourceEntity extends GenericEntity<String>, SortSupportEntity {

    /**
     * SYSTEM_ID
     */
    String SYSTEM_ID = "83f01e5540fb452ea600884f98debcfe";

    Integer getIsMenu();

    void setIsMenu(Integer isMenu);

    String getModuleId();

    void setModuleId(String moduleId);

    String getSourceFile();

    void setSourceFile(String sourceFile);

    String getInvokeFunction();

    void setInvokeFunction(String invokeFunction);

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getUrl();

    void setUrl(String url);

    String getImageUrl();

    void setImageUrl(String imageUrl);

    String getComments();

    void setComments(String comments);

    Integer getTyping();

    void setTyping(Integer typing);

    String getSystemId();

    void setSystemId(String systemId);

    String getSystemCode();

    void setSystemCode(String systemCode);

    String getTenantId();

    void setTenantId(String tenantId);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    Set<ResourcePoolEntity> getResourcePool();

    void setResourcePool(Set<ResourcePoolEntity> resourcePool);

}
