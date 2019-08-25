package com.zwj.system.authorication.resource.entity;

import com.zwj.framework.common.entity.simple.GenericSortStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 4:42 PM
 * @description:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_resource")
public class ResourceEntity extends GenericSortStringIdEntity implements IResourceEntity{

    private String name;

    private String code;

    private String url;

    @Column(name = "image_url")
    private String imageUrl;

    private String comments;

    private Integer typing;

    @Column(name = "system_id")
    private String systemId;

    @Column(name = "system_code")
    private String systemCode;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "is_menu")
    private Integer isMenu;

    @Column(name = "module_id")
    private String moduleId;

    @Column(name = "source_file")
    private String sourceFile;

    @Column(name = "invoke_function")
    private String invokeFunction;

    @Column(name = "parent_id")
    private String parentId;

    @Column(name = "level")
    private String level;

    @Column(name = "path")
    private String path;

    @ManyToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JoinTable(
            name = "t_link_resource_pool",
            joinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "resource_pool_id", referencedColumnName = "id")
    )
    private Set<ResourcePoolEntity> resourcePool = new HashSet<>();
}
