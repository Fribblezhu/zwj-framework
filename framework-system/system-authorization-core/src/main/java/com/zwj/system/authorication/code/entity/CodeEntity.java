package com.zwj.system.authorication.code.entity;

import com.zwj.framework.common.entity.simple.GenericRecordStringIdEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 3:54 PM
 * @description:
 */
@Entity
@Table(name = "t_code")
@Getter
@Setter
@NoArgsConstructor
public class CodeEntity extends GenericRecordStringIdEntity implements ICodeEntity {

    @Column(name = "parent_id")
    private String parentId;

    private String name;

    @Column(name = "code_key")
    private String codeKey;

    private Integer status;

    private String comments;

    @Column(name = "show_order")
    private Integer showOrder;

    @Column(name = "is_virtual")
    private Integer isVirtual;

    @Column(name = "is_group")
    private Integer isGroup;

    @Column(name = "group_key")
    private String groupKey;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "sys_default")
    private String sysDefault;

}
