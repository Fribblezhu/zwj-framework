package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.SortSupportEntity;


/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 3:21 PM
 * @description:
 */
public interface IOrganizationEntity extends GenericEntity<String>, SortSupportEntity {
    /**
     * 是虚拟组织
     */
    Integer IS_VIRTUAL = 1;

    /**
     * 不是虚拟组织
     */
    Integer NOT_VIRTUAL = 2;

    /**
     * 对上级不可见
     */
    Integer IS_INDEPENDENT = 2;

    /**
     * 对上级可见
     */
    Integer NOT_INDEPENDENT = 1;

    /**
     * 租户
     */
    String IS_TENANT = "1";

    /**
     * unit
     */
    String IS_UNIT = "1";

    /**
     * depart
     *
     */
    String IS_DEPART = "20";

    String getOrgSystemCode();

    void setOrgSystemCode(String orgSystemCode);

    String getNameFirstSpell();

    void setNameFirstSpell(String nameFirstSpell);

    String getParentId();

    void setParentId(String parentId);

    String getName();

    void setName(String name);

    String getCode();

    void setCode(String code);

    String getAbbreviation();

    void setAbbreviation(String abbreviation);

    String getLevel();

    void setLevel(String level);

    Integer getIsVirtual();

    void setIsVirtual(Integer isVirtual);

    Integer getStatus();

    void setStatus(Integer status);

    Integer getApprovalStatus();

    void setApprovalStatus(Integer approvalStatus);

    String getComments();

    void setComments(String comments);

    String getTenantId();

    void setTenantId(String tenantId);

    Integer getIndependent();

    void setIndependent(Integer independent);

    Integer getMaxLimit();

    void setMaxLimit(Integer maxLimit);

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


}
