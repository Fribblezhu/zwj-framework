package com.zwj.framework.logging;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author: zwj
 * @Date: 6/25/19
 * @Time: 3:37 PM
 * @description:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccessLogInfo {

    /**
     * 日志id
     */
    private String id;

    /**
     * 访问的操作
     *
     * @see AccessLogger#value()
     */
    private String action;

    /**
     * 描述
     *
     * @see AccessLogger#describe()
     */
    private String describe;

    /**
     * 访问对应的java方法
     */
    private Method method;

    /**
     * 访问对应的java类
     */
    private Class target;

    /**
     * 请求的参数,参数为java方法的参数而不是http参数,key为参数名,value为参数值.
     */
    private Map<String, Object> parameters;

    /**
     * 请求者ip地址
     */
    private String ip;

    /**
     * 请求的url地址
     */
    private String url;

    /**
     * http 请求头集合
     */
    private Map<String, String> httpHeaders;

    /**
     * http 请求方法, GET,POST...
     */
    private String httpMethod;

    /**
     * 响应结果,方法的返回值
     */
    private Object response;

    /**
     * 请求时间戳
     *
     * @see System#currentTimeMillis()
     */
    private long requestTime;

    /**
     * 响应时间戳
     *
     * @see System#currentTimeMillis()
     */
    private long responseTime;

    /**
     * 异常信息,请求对应方法抛出的异常
     */
    private Throwable exception;

}
