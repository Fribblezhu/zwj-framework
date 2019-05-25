package com.zwj.framework.auth.aop;

import java.lang.reflect.Method;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 1:58 PM
 * @description:
 */
public interface AopMethodAuthorizeDefinitionParser {

    AuthorizeDefinition parser(Class targetClass, Method method, MethodInterceptorContent)
}
