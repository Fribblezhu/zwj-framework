package com.zwj.system.authorication.user.entity;

import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import com.zwj.system.authorication.role.entity.RoleEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 11:00 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_link_user_role")
public class LinkUserRoleEntity  extends GenericStringIdEntity implements ILinkUserRoleEntity {


    @Column(name = "is_temporary")
    private Integer isTemporary;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_date")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "show_order")
    private Long showOrder;

    @Column(name = "organize_id")
    private String organizeId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;

}
