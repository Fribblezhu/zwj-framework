package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 11:36 PM
 * @description:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_link_user_organization")
public class LinkUserOrganizationEntity  extends GenericStringIdEntity implements ILinkUserOrganizationEntity {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "organization_id")
    private String organizationId;

    private Integer typing;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "show_order")
    private Long showOrder;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "role_type")
    private Integer roleType;

    @Column(name = "unit_id")
    private String unitId;


}
