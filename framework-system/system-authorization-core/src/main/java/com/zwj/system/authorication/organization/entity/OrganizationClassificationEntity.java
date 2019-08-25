package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 9:59 PM
 * @description:
 */

@Getter
@Setter
@Entity
@Table(name="t_organization_classification")
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationClassificationEntity extends GenericStringIdEntity implements IOrganizationClassificationEntity {


    @Id
    private String id;

    private String name;

    private String code;

    @Column(name = "parent_id")
    private String parentId;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "show_order")
    private Long showOrder;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "modify_user")
    private String modifyUser;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "modify_time")
    private Timestamp modifyTime;

    private String comments;
}
