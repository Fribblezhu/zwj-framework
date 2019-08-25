package com.zwj.system.authorication.tenant.entity;

import com.zwj.framework.common.entity.GenericEntity;



import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 2:53 PM
 * @description:
 */
public interface ITenantEntity extends   GenericEntity<String> {

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getAbbreviation();

    void setAbbreviation(String abbreviation);

    Integer getMaxLimit();

    void setMaxLimit(Integer maxLimit);

    String getContactPerson();

    void setContactPerson(String contactPerson);

    String getAddress();

    void setAddress(String address);

    String getContactPhone();

    void setContactPhone(String contactPhone);

    String getEmail();

    void setEmail(String email);

    Date getEffectiveTime();

    void setEffectiveTime(Date effectiveTime);

    Date getExpirationTime();

    void setExpirationTime(Date expirationTime);

    Integer getMaxUserNumber();

    void setMaxUserNumber(Integer maxUserNumber);

    String getDomainName();

    void setDomainName(String domainName);

    String getLogoUrl();

    void setLogoUrl(String logoUrl);

    String getBackgroudUrl();

    void setBackgroudUrl(String backgroudUrl);

    String getShowName();

    void setShowName(String showName);

    Integer getStatus();

    void setStatus(Integer status);

    String getComments();

}
