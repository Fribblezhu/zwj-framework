package com.zwj.framework.auth.annotation;

import java.lang.annotation.*;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:55 AM
 * @description:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Authorize {

    // 指定用户
    String[] user() default  {};
    // 指定角色
    String[] role() default {};
    // 指定操作
    String[] action() default {};
    // 指定模块
    String[] permission() default {};
    // 无权限时提示的消息
    String[] message() default "无权限";
    // 是否合并类上的注解
    boolean merge() default true;
    // 是否忽略
    boolean ignore() default false;
    // 描述
    String description() default  "";
    // 多个条件时的逻辑操作
    Logical logical() default Logical.DEFAULT;


}

