package com.zwj.system.authorication.user.entity;


import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;

import java.sql.Date;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 2:10 PM
 * @description:
 */
public interface IUserSessionEntity extends RecordModifierEntity, RecordCreatorEntity, GenericEntity<String> {

    String getUserId();

    void setUserId(String userId);

    String getUserName();

    void setUserName(String userName);

    Date getBeginDate();

    void setBeginDate(Date beginDate);

    String getIpAddress();

    void setIpAddress(String ipAddress);

    String getMacNo();

    void setMacNo(String macNo);

    Date getTokenValidateDate();

    void setTokenValidateDate(Date tokenValidateDate);

    String getLoginName();

    void setLoginName(String loginName);

    Integer getStatus();

    void setStatus(Integer status);

    String getTenantId();

    void setTenantId(String tenantId);

}
