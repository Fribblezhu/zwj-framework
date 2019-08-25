package com.zwj.framework.auth.define;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.utils.aop.MethodInterceptorContext;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 5/26/19
 * @Time: 2:00 PM
 * @description:  接口及数据权限校验上下文,存放所有与权限校验相关的信息.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizingContext {

    private AuthorizeDefinition definition;

    private Authentication authentication;

    private MethodInterceptorContext methodInterceptorContext;

}
