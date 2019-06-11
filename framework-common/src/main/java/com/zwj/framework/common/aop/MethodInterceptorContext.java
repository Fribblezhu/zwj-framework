package com.zwj.framework.common.aop;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Optional;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 3:15 PM
 * @description:
 */
public interface MethodInterceptorContext extends Serializable {


    Object getTarget();

    Method getMethod();

    Map<String ,Object> getAllArgs();

    <T> Optional<T>  getParameter(String name);

    <T extends Annotation> T getAnnotation(Class<T> anClazz);

    Object getInvokeResult();

}
