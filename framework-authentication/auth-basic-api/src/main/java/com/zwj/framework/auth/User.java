package com.zwj.framework.auth;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:57 AM
 * @description:
 */
public interface User {

    /**
     * 用户ID
     * @return
     */
    String getId();

    /**
     * 用户名
     * @return
     */
    String getName();

    /**
     * 昵称
     * @return
     */
    String getUsername();

    String getType();


}
