package com.zwj.system.authorication.user.entity;

import com.zwj.framework.common.entity.GenericEntity;



import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 11:42 AM
 * @description:
 */
public interface IAccountEntity extends   GenericEntity<String> {

    /**
     * superadmin所创建账号
     */
    Integer IS_SUPERADMIN_CREATE = 1;

    /**
     * 不是由superadmin创建
     */
    Integer NOT_SUPERADMIN_CREATE = 0;


    Date getBeginValidTime();

    void setBeginValidTime(Date beginValidTime);

    Date getEndValidTime();

    void setEndValidTime(Date endValidTime);

    String getIdentityId();

    void setIdentityId(String identityId);

    String getName();

    void setName(String name);

    String getLoginName();

    void setLoginName(String loginName);

    String getPassword();

    void setPassword(String password);

    String getSalt();

    void setSalt(String salt);

    String getOpenId();

    void setOpenId(String openId);

    String getOpenSecret();

    void setOpenSecret(String openSecret);

    String getEmail();

    void setEmail(String email);

    Integer getStatus();

    void setStatus(Integer status);

    Boolean getIsTemporary();

    void setIsTemporary(Boolean isTemporary);

    Date getStartDate();

    void setStartDate(Date startDate);

    Date getEndDate();

    void setEndDate(Date endDate);

    String getTenantId();

    void setTenantId(String tenantId);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    String getValidataCode();

    void setValidataCode(String validataCode);

    Date getValidataOutDate();

    void setValidataOutDate(Date validataOutDate);

    String getLastLoginIp();

    void setLastLoginIp(String lastLoginIp);

    Date getLastLoginDate();

    void setLastLoginDate(Date lastLoginDate);

    Timestamp getModifyPasswordTime();

    void setModifyPasswordTime(Timestamp modifyPasswordTime);

    Timestamp getLoginTime();

    void setLoginTime(Timestamp loginTime);

    Integer getIsSuperadmin();

    void setIsSuperadmin(Integer isSuperadmin);

    String getUnitId();

    void setUnitId(String unitId);

}
