package com.zwj.framework.auth.aop;

import com.zwj.framework.auth.define.AuthorizeDefinition;
import com.zwj.framework.common.aop.MethodInterceptorContext;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 1:58 PM
 * @description:
 */
public interface AopMethodAuthorizeDefinitionParser {

    AuthorizeDefinition parser(Class clazz, Method method, MethodInterceptorContext context);

    default AuthorizeDefinition parser(Class clazz, Method method) {
        return parser(clazz, method, null);
    }

    List<AuthorizeDefinition> getAllParser();
}
