package com.zwj.system.authorication.user.entity;

import com.zwj.framework.common.data.Gender;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.SortSupportEntity;


import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 11:22 AM
 * @description:
 */
public interface IUserEntity extends   GenericEntity<String>, SortSupportEntity {
    Integer status_valid = 1;
    Integer status_invalid = 0;

    String getOrganizeId();

    void setOrganizeId(String organizeId);

    Date getBeginValidTime();

    void setBeginValidTime(Date beginValidTime);

    Date getEndValidTime();

    void setEndValidTime(Date endValidTime);

    String getIdentityId();

    void setIdentityId(String identityId);

    String getMobile();

    String getTelephone();

    void setMobile(String mobile);

    void setTelephone(String telephone);

    String getUsername();

    String getLoginName();

    Integer getAge();

    String getAddress();

    Gender getGender();

    String getEmail();

    String getAbbreviation();

    Date getBirthDay();

    String getFax();

    String getPicUrl();

    String getComments();

    String getPhone();

    void setPhone(String phone);

    String getTenantId();

    void setUsername(String username);

    void setLoginName(String loginName);

    void setAge(Integer age);

    void setAddress(String address);

    void setGender(Gender gender);

    void setEmail(String email);

    void setAbbreviation(String abbreviation);

    void setBirthDay(Date birthday);

    void setFax(String fax);

    void setPicUrl(String picUrl);

    void setComments(String comments);

    void setTenantId(String tenantId);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    Integer getStatus();

    String getModifyUser();

    void setStatus(Integer status);

    void setModifyUser(String modifyUser);

    Integer getIsSuperadmin();

    void setIsSuperadmin(Integer isSuperadmin);

    String getUnitId();

    void setUnitId(String unitId);

    Integer getBindAddressType();

    void setBindAddressType(Integer bindAddressType);

    String getBindIpAddress();

    void setBindIpAddress(String bindIpAddress);

    String getBindMacAddress();

    void setBindMacAddress(String bindMacAddress);

    /**
     * @return the flag1
     */
    String getFlag1();

    /**
     * @param flag1
     *            the flag1 to set
     */
    void setFlag1(String flag1);

    /**
     * @return the flag2
     */
    String getFlag2();

    /**
     * @param flag2
     *            the flag2 to set
     */
    void setFlag2(String flag2);

    /**
     * @return the flag3
     */
    String getFlag3();

    /**
     * @param flag3
     *            the flag3 to set
     */
    void setFlag3(String flag3);

    /**
     * @return the flag4
     */
    String getFlag4();

    /**
     * @param flag4
     *            the flag4 to set
     */
    void setFlag4(String flag4);

    /**
     * @return the flag5
     */
    String getFlag5();

    /**
     * @param flag5
     *            the flag5 to set
     */
    void setFlag5(String flag5);

    /**
     * @return the flag6
     */
    String getFlag6();

    /**
     * @param flag6
     *            the flag6 to set
     */
    void setFlag6(String flag6);

    /**
     * @return the flag7
     */
    String getFlag7();

    /**
     * @param flag7
     *            the flag7 to set
     */
    void setFlag7(String flag7);

    /**
     * @return the flag8
     */
    String getFlag8();

    /**
     * @param flag8
     *            the flag8 to set
     */
    void setFlag8(String flag8);

    /**
     * @return the flag9
     */
    String getFlag9();

    /**
     * @param flag9
     *            the flag9 to set
     */
    void setFlag9(String flag9);

    /**
     * @return the flag10
     */
    String getFlag10();

    /**
     * @param flag10
     *            the flag10 to set
     */
    void setFlag10(String flag10);

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    int hashCode();

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    boolean equals(Object obj);

}
