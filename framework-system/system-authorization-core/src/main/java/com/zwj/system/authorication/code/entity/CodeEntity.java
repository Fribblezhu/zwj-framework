package com.zwj.system.authorication.code.entity;

import com.zwj.framework.common.entity.simple.GenericSortStringIdEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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
public class CodeEntity extends GenericSortStringIdEntity implements ICodeEntity {

    @Column(name = "parent_id")
    private String parentId;

    private String name;

    @Column(name = "code")
    private String code;

    private Integer status;

    @Column(name = "description", length = 1023)
    private String description;

    @Column(name = "is_virtual")
    private Integer isVirtual;

    @Column(name = "is_group")
    private Integer isGroup;

    @Column(name = "group_key")
    private String groupKey;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "isSystem")
    private Integer isSystem;

    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinTable(name ="t_code_codec",
        joinColumns = @JoinColumn(name = "code_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "codec_id", referencedColumnName = "id"))
    private Set<CodecEntity> codecList;

}
