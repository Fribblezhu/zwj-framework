package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.GenericEntity;



import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 9:58 PM
 * @description:
 */
public interface IOrganizationClassificationEntity extends   GenericEntity<String> {

    /**
     * deaultOrgClassId
     */
    String DEFAULT_ORG_CLASS_ID = "0d04912bde854b199647a3c151c7fcdc";

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getParentId();

    void setParentId(String parentId);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    String getTenantId();

    void setTenantId(String tenantId);

    Long getShowOrder();

    void setShowOrder(Long showOrder);



    String getComments();

    void setComments(String comments);


}
