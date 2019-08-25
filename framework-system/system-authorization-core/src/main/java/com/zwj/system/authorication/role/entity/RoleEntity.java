package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 9:27 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_role")
public class RoleEntity extends GenericStringIdEntity implements IRoleEntity {

    private String name;

    private String code;

    private String comments;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "show_order")
    private Long showOrder;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "is_public")
    private Integer isPublic;

    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "name_first_spell")
    private String nameFirstSpell;

    /**
     * 专业线id
     */
    @Transient
    private String codeId;

    /**
     * 绑定专业线name
     */
    @Transient
    private String codeName;

}
