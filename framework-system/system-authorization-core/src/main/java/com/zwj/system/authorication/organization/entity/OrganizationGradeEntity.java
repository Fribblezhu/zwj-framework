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
 * @Date: 6/20/19
 * @Time: 11:01 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_organization_grade")
public class OrganizationGradeEntity extends GenericStringIdEntity implements IOrganizationGradeEntity {

    private String name;

    private String value;


    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "tenant_id")
    private String tenantId;

}
