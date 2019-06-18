package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.simple.GenericRecordStringIdEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 11:34 AM
 * @description:
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "t_link_role_classification")
public class LinkRoleClassificationEntity extends GenericRecordStringIdEntity implements ILinkRoleClassification {


    @Column(name = "role_id")
    private String roleId;

    @Column(name = "roleclass_id")
    private String roleclassId;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "show_order")
    private Long showOrder;

    @Column(name = "unit_id")
    private String unitId;


}
