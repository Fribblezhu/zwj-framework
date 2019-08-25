package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.GenericEntity;



import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 11:34 PM
 * @description:
 */
public interface ILinkUserOrganizationEntity extends   GenericEntity<String> {

    /**
     * 兼职
     */
    Integer IS_PARTTIME = 1;

    /**
     * 专职
     */
    Integer IS_FULLTIME = 0;

    String getUserId();

    void setUserId(String userId);

    String getOrganizationId();

    void setOrganizationId(String organizationId);

    Integer getTyping();

    void setTyping(Integer typing);

    Date getStartTime();

    void setStartTime(Date startTime);

    Date getEndTime();

    void setEndTime(Date endTime);

    String getTenantId();

    void setTenantId(String tenantId);

    Long getShowOrder();

    void setShowOrder(Long showOrder);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    Integer getRoleType();

    void setRoleType(Integer roleType);

    String getUnitId();

    void setUnitId(String unitId);

}
