package com.zwj.system.authorication.system.entity;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.SortSupportEntity;
import com.zwj.framework.common.entity.TreeSupportEntity;

/**
 * @author: zwj
 * @Date: 7/11/19
 * @Time: 7:41 PM
 * @description:
 */
public interface ISystemEntity<T extends ISystemEntity> extends GenericEntity<String>,TreeSupportEntity<T>, SortSupportEntity {

    String getCode();

    void setCode(String code);

    String getName();

    void setName(String name);

}
