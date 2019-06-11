package com.zwj.framework.auth.access;

import com.zwj.framework.auth.define.AuthorizingContext;

/**
 * @author: zwj
 * @Date: 5/27/19
 * @Time: 5:05 PM
 * @description:  数据权限校验控制器.
 */
public interface DataAccessController {

    boolean doAccess(DataAccessConfig config, AuthorizingContext context);

}
