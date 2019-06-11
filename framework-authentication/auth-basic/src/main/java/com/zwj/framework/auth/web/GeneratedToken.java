package com.zwj.framework.auth.web;

import java.util.Map;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 10:00 PM
 * @description:
 *  生成好的token,包含令牌原文.
 */
public interface GeneratedToken {


    // 存放生成后的扩展token, 如jwt
    Map<String,Object> getResponse();

    // 原始token数据
    String getToken() ;

    // token 类型
    String getType();

    // 过期时间
    int getTimeout();

}
