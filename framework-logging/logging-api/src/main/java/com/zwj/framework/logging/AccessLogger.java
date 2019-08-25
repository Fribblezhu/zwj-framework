package com.zwj.framework.logging;

import java.lang.annotation.*;

/**
 * @author: zwj
 * @Date: 6/25/19
 * @Time: 3:16 PM
 * @description:
 *   访问日志注解
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Documented()
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
public @interface AccessLogger {

    String value();

    String describe() default  "";

    boolean ignore() default false;


}
