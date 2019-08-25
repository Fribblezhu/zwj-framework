package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 2:53 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_link_role_resource")
public class LinkRoleResourceEntity extends GenericStringIdEntity implements ILinkRoleResourceEntity {

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "resource_id")
    private String resourceId;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "modify_time")
    private Timestamp modifyTime;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "modify_user")
    private String modifyUser;

    @Column(name = "show_order")
    private Long showOrder;

    @Column(name = "unit_id")
    private String unitId;


}
