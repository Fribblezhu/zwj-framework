package com.zwj.system.authorication.system.entity;

import com.zwj.framework.common.entity.simple.AbstractTreeSortStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: zwj
 * @Date: 7/11/19
 * @Time: 7:45 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "t_system")
public class SystemEntity extends AbstractTreeSortStringIdEntity<SystemEntity> implements ISystemEntity<SystemEntity>   {

    private String code;

    private String name;

}
