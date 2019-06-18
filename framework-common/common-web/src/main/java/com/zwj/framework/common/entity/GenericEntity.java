package com.zwj.framework.common.entity;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 12:31 PM
 * @description:
 */
public interface GenericEntity<PK> extends Entity {

    PK getId();

    void setId(PK pk);

}
