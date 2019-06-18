package com.zwj.framework.common.entity;


/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 11:15 AM
 * @description:
 */
public interface LogicalDeleteEntity extends Entity {

    String getDeleterId();

    void setDeleterId(String deleterId);



}
