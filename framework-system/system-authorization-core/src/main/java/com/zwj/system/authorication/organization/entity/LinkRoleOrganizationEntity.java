package com.zwj.system.authorication.organization.entity;

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
 * @Date: 6/21/19
 * @Time: 11:21 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="t_link_role_organization")
public class LinkRoleOrganizationEntity extends GenericStringIdEntity implements ILinkRoleOganizationEntity {


    @Column(name = "role_id")
    private String roleId;

    @Column(name = "org_id")
    private String orgId;

    private Integer status;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "show_order")
    private Long showOrder;

}
