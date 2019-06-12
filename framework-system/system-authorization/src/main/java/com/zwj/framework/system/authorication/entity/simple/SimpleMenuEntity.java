package com.zwj.framework.system.authorication.entity.simple;

import com.zwj.framework.common.entity.simple.AbstractSimpleTreeSortEntity;
import com.zwj.framework.system.authorication.entity.MenuEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 12:33 PM
 * @description:
 */
@Setter
@Getter
public class SimpleMenuEntity extends AbstractSimpleTreeSortEntity<String> implements MenuEntity {

    private String name;

    private String description;

    private byte status;

    private String sortIndex;

    private String permissionId;

    private String url;

    private String icon;

    private List<MenuEntity> children;

}
