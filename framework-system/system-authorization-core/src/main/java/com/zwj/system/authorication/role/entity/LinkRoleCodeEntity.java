package com.zwj.system.authorication.role.entity;

import com.zwj.framework.common.entity.simple.GenericRecordStringIdEntity;
import com.zwj.system.authorication.code.entity.CodeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 2:34 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_link_role_code")
public class LinkRoleCodeEntity extends GenericRecordStringIdEntity implements ILinkRoleCodeEntity {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "code_id")
    private CodeEntity codeEntity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;

    private Integer status;

    private String comments;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "show_order")
    private Long showOrder;
}
