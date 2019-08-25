package com.zwj.framework.utils;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 5:24 PM
 * @description:
 */
public class AopUtils {

    private AopUtils () {

    }

    /**
     *  从指定类的方法中找出注解
      * @param clazz  指定类
     * @param method  指定方法
     * @param anClazz 对应的注解
     * @param <T>     泛型，继承自Annotation
     * @return  返回注解
     */
    public static <T extends Annotation> T findMethodAnnotation(Class clazz, Method method, Class<T> anClazz) {
        Method targetMethod = method;
        // 若该本身方法有对应的注解，则直接通过spring的方法查找并返回.
        T a = AnnotationUtils.findAnnotation(targetMethod, anClazz);
        if(null != a)
            return a;
        // 尝试从clazz本身找到同名的method
        targetMethod = ClassUtils.getMostSpecificMethod(method, clazz);
        a = AnnotationUtils.findAnnotation(targetMethod, anClazz);
        // 若clazz本身的方法也没有对应的注解
        if (a == null) {
            // 获取实现的接口和继承的类
            List<Class> supers = new ArrayList<>(Arrays.asList(clazz.getInterfaces()));
            if(clazz.getSuperclass() != Object.class) {
                supers.add(clazz.getSuperclass());
            }
            // 从类中找到是否存在相同的method.
            for(Class c: supers) {
                if(null == c)
                    continue;
                Method[] ims = new Method[1];
                ReflectionUtils.doWithLocalMethods(clazz, im -> {
                    // 方法名和参数个数相同
                    if(im.getName().equals(method.getName()) && im.getParameterCount() == method.getParameterCount()) {
                        ims[0] = im;
                    }
                });
                if(null != ims[0]) {
                    a = findMethodAnnotation(c, ims[0], anClazz);
                    if(null != a)
                        return a;
                }
            }
        }
        return a;

    }


    public static <T extends Annotation> T findAnnotation(Class clazz, Class<T> anClazz) {
        return AnnotationUtils.findAnnotation(clazz, anClazz);
    }



}
