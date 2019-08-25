package com.zwj.system.authorication.resource.entity;

import com.zwj.framework.common.entity.simple.GenericSortStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 5:35 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_resource_pool")
public class ResourcePoolEntity extends GenericSortStringIdEntity implements IResourcePoolEntity {


    @Column(name = "comments", length = 1000)
    private String comments;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

    private String name;

}
