package com.zwj.framework.common.entity;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 11:06 AM
 * @description:
 */
public interface TreeSupportEntity<PK> extends GenericEntity<PK> {

    PK getParentId();

    void setParentId(PK parentId);

    String getPath();

    void setPath(String path);

    int getLevel();

    void setLevel(int level);

    <T extends TreeSupportEntity<PK>> List<T> getChildren();


}
