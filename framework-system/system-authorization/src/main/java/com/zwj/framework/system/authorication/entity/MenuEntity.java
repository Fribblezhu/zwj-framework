package com.zwj.framework.system.authorication.entity;

import com.zwj.framework.common.entity.SortSupportEntity;
import com.zwj.framework.common.entity.TreeSupportEntity;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 12:27 PM
 * @description:
 */
public interface MenuEntity extends SortSupportEntity, TreeSupportEntity<String> {


    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    String getPermissionId();

    void setPermissionId(String permissionId);

    byte getStatus();

    void setStatus(byte status);

    String getUrl();

    void setUrl(String url);

    String getIcon();

    void setIcon(String icon);

    void setChildren(List<MenuEntity> children);

}
