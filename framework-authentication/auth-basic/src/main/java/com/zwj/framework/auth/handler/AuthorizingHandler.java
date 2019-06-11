package com.zwj.framework.auth.handler;

import com.zwj.framework.auth.define.AuthorizingContext;

/**
 * @author: zwj
 * @Date: 5/26/19
 * @Time: 7:10 PM
 * @description: 权限校验基础接口,提供校验接口权限@handRBAC和数据权限校验@handDataAccess两个方法.
 *                 可根据实际情况实现校验方法.
 * */
public interface AuthorizingHandler {

   void handRBAC(AuthorizingContext context);

   void handDataAccess(AuthorizingContext context);

}
