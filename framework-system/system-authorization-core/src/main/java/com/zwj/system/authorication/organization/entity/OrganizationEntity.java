package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.simple.GenericSortStringIdEntity;
import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 3:21 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_organization")
public class OrganizationEntity extends GenericSortStringIdEntity implements IOrganizationEntity {

    @Column(name = "parent_id")
    private String parentId;

    private String name;

    /**
     * 首字母简拼
     */
    @Column(name = "name_first_spell")
    private String nameFirstSpell;

    private String code;

    private String abbreviation;

    @Column(name = "level")
    private String level;

    @Column(name = "is_virtual")
    private Integer isVirtual;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    private String comments;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer independent;

    @Column(name = "max_limit")
    private Integer maxLimit;

    @Column(name = "org_system_code")
    private String orgSystemCode;

    @Column(name = "bind_parent_org")
    private String bindParentOrg;

    /** 添加扩展字段 **/
    private String flag1;

    private String flag2;

    private String flag3;

    private String flag4;

    private String flag5;

    private String flag6;

    private String flag7;

    private String flag8;

    private String flag9;

    private String flag10;

}
