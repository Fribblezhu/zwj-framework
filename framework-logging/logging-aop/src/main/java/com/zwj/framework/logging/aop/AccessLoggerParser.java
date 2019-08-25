package com.zwj.framework.logging.aop;

import com.zwj.framework.logging.LoggerDefine;
import com.zwj.framework.utils.aop.MethodInterceptorHolder;

import java.lang.reflect.Method;

/**
 * @author: zwj
 * @Date: 6/26/19
 * @Time: 10:33 AM
 * @description:
 */
public interface AccessLoggerParser {

    boolean support(Class clazz, Method method);

    LoggerDefine parser(MethodInterceptorHolder holder);

}
