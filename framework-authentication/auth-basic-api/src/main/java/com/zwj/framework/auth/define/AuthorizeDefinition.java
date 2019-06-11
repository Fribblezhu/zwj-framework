package com.zwj.framework.auth.define;

import com.zwj.framework.auth.annotation.Logical;

import java.util.Set;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 3:06 PM
 * @description:
 */
public interface AuthorizeDefinition {

    // 权限校验的时机
    Phased getPhased();

    // 数据校验定义
    DataAccessDefinition getDataAccessDefinition();

    // 涉及多个权限时的逻辑合并
    Logical getLogical();

    //
    Set<String> getPermissions();

    Set<String> getRoles();

    Set<String> getActions();

    Set<String> getUsers();


}
