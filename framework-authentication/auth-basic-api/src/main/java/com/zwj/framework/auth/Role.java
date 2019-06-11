package com.zwj.framework.auth;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:58 AM
 * @description:
 */
public interface Role {

    /**
     * 角色id
     * @return
     */
    String getId();

    /**
     * 角色名称
     * @return
     */
    String getName();

    String getCode();

}
