package com.zwj.framework.common.entity;

import java.util.Set;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 11:06 AM
 * @description:
 */
public interface TreeSupportEntity<T extends TreeSupportEntity> {

    String getPath();

    void setPath(String path);

    Integer getLevel();

    void setLevel(Integer level);

    Set<T> getChildren();

    void setChildren(Set<T> children);

}
