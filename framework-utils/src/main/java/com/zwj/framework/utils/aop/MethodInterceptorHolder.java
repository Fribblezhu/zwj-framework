package com.zwj.framework.utils.aop;

import com.zwj.framework.utils.AopUtils;
import com.zwj.framework.utils.ThreadLocalUtils;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.util.DigestUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author: zwj
 * @Date: 5/26/19
 * @Time: 9:19 AM
 * @description:
 */
public class MethodInterceptorHolder {

    private final static ParameterNameDiscoverer NAME_DISCOVERER = new LocalVariableTableParameterNameDiscoverer();

    public MethodInterceptorHolder() {
    }


    public static MethodInterceptorHolder current() {
        return ThreadLocalUtils.get(MethodInterceptorHolder.class.getName());
    }

    public static MethodInterceptorHolder clear() {
        return ThreadLocalUtils.getAndRemove(MethodInterceptorHolder.class.getName());
    }

    public static MethodInterceptorHolder setCurrent(MethodInterceptorHolder methodInterceptorHolder) {
        return ThreadLocalUtils.push(MethodInterceptorHolder.class.getName(), methodInterceptorHolder);
    }

    public static MethodInterceptorHolder create(MethodInvocation invocation) {
        String id = DigestUtils.md5DigestAsHex(String.valueOf(invocation.getMethod()).getBytes());
        String[] parameterNames = NAME_DISCOVERER.getParameterNames(invocation.getMethod());
        Object[] arguments = invocation.getArguments();
        Map<String, Object> argMap = new HashMap<>();
        for (int i = 0 ; i < arguments.length; i++) {
            argMap.put((i < parameterNames.length && (parameterNames[i] == null || parameterNames[i].equals("")))?"arg_" + i : parameterNames[i], arguments[i]);
        }
        return new MethodInterceptorHolder(id, invocation.getMethod(), invocation.getThis(), argMap);
    }


    public MethodInterceptorHolder(String id, Method method, Object aThis, Map<String,Object> argMap) {
        this.id = id;
        this.method = method;
        this.target = aThis;
        this.args = argMap;
    }

    private String id;

    private Map<String, Object> args;

    private Method method;

    private Object target;

    public String getId() {
        return id;
    }

    public Method getMethod() {
        return method;
    }

    public <T extends Annotation> T findMethodAnnotaion(Class<T> anClazz) {
        return AopUtils.findMethodAnnotation(anClazz, method, anClazz);
    }

    public <T extends  Annotation> T findClassAnnotation(Class<T> anClazz) {
        return AopUtils.findAnnotation(target.getClass(), anClazz);
    }

    public <T extends Annotation> T findAnnotation(Class<T> anClazz) {
        return  AopUtils.findMethodAnnotation(target.getClass(), method, anClazz);
    }

    public MethodInterceptorContext createInterceptorContext(){
        return createInterceptorContext(null);
    }

    public MethodInterceptorContext createInterceptorContext(Object invokeResult) {
        return new MethodInterceptorContext() {

            @Override
            public Object getTarget() {
                return target;
            }

            @Override
            public Method getMethod() {
                return method;
            }

            @Override
            public Map<String, Object> getAllArgs() {
                return args;
            }

            @Override
            @SuppressWarnings("unchecked")
            public <T> Optional<T> getParameter(String name) {
                if(args == null)
                    return Optional.empty();
                return Optional.ofNullable((T)args.get(name));
            }

            @Override
            public <T extends Annotation> T getAnnotation(Class<T> anClazz) {
                return findAnnotation(anClazz);
            }

            @Override
            public Object getInvokeResult() {
                return invokeResult;
            }
        };
    }



}
