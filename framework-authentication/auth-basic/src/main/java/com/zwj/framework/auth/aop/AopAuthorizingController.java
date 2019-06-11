package com.zwj.framework.auth.aop;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.auth.define.AuthorizeDefinition;
import com.zwj.framework.auth.define.AuthorizingContext;
import com.zwj.framework.auth.define.Phased;
import com.zwj.framework.auth.exception.UnAuthorizedException;
import com.zwj.framework.auth.handler.AuthorizingHandler;
import com.zwj.framework.common.aop.MethodInterceptorContext;
import com.zwj.framework.common.aop.MethodInterceptorHolder;
import com.zwj.framework.common.utils.AopUtils;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 1:51 PM
 * @description:
 */
@Slf4j
public class AopAuthorizingController extends StaticMethodMatcherPointcutAdvisor implements CommandLineRunner {

    private  ApplicationEventPublisher publisher;

    private DefaultAopMethodAuthorizeDefinitionParser parser = new DefaultAopMethodAuthorizeDefinitionParser();

    // 是否自动解析
    private boolean autoParser = false;

    public void setAutoParser(boolean autoParser) {
        this.autoParser = autoParser;
    }

    /**
     *  权限验证处理流程控制,从整体上定义权限验证的流程.
     * @param authorizingHandler  权限校验分发者
     * @param aopMethodAuthorizeDefinitionParser  接口的权限定义解析者
     */
    @SuppressWarnings("unchecked")
    public AopAuthorizingController(AuthorizingHandler authorizingHandler, AopMethodAuthorizeDefinitionParser aopMethodAuthorizeDefinitionParser) {
        super((MethodInterceptor) methodInvocation-> {
            // 创建holder,存放当前拦截的方法 .
            MethodInterceptorHolder methodInterceptorHolder = MethodInterceptorHolder.create( methodInvocation);
            // context 由holder创建，存放当前拦截方法的class , argument, annotation等属性
            MethodInterceptorContext interceptorContext = methodInterceptorHolder.createInterceptorContext();

            AuthorizeDefinition definition = aopMethodAuthorizeDefinitionParser.parser(methodInvocation.getClass(),methodInvocation.getMethod(), interceptorContext);
            Object result = null;
            boolean isControl = false;
            if(null != definition) {
                // 获取当前访问用户的权限
                Authentication authentication = Authentication.current().orElseThrow(UnAuthorizedException::new);
                // 创建当前用户访问的权限校验上下文
                AuthorizingContext authorizingContext = new AuthorizingContext(definition, authentication, interceptorContext);
                isControl = true;
                // 临时存放数据权限验证时机
                Phased dataAccessPhased = null;
                if(definition.getDataAccessDefinition() != null) {
                    dataAccessPhased = definition.getDataAccessDefinition().getPhased();
                }
                // 方法调用前验证接口权限
                if(definition.getPhased() == Phased.before) {
                    // 优先验证接口权限
                    authorizingHandler.handRBAC(authorizingContext);

                    // 若数据权限也在方法调用前验证
                    if(dataAccessPhased == Phased.before) {
                        // 则必须在方法进入前验证数据权限
                        authorizingHandler.handDataAccess(authorizingContext);
                    }
                    // 接口调用放行,允许调用.
                    result = methodInvocation.proceed();
                    // 若数据权限在方法点用后验证
                    if(dataAccessPhased == Phased.after) {
                        // 接口权限验证通过,并且数据校验在方法调用后,则该接口对当前用户是开放的.
                        authorizingContext.setMethodInterceptorContext(methodInterceptorHolder.createInterceptorContext(result));
                        // 最后验证数据权限
                        authorizingHandler.handDataAccess(authorizingContext);
                    }
                }else {
                    // 若数据权限验证在方法调用前
                    if(dataAccessPhased == Phased.before) {
                        // 优先验证数据权限
                        authorizingHandler.handDataAccess(authorizingContext);
                    }
                    // 接口调用放行,允许调用接口.
                    result = methodInvocation.proceed();
                    // 接口权限验证在方法调用后，并且数据权限验证通过或在方法调用后,则该接口对当前用户是开放的.
                    authorizingContext.setMethodInterceptorContext(methodInterceptorHolder.createInterceptorContext(result));
                    // 验证接口调用权限
                    authorizingHandler.handRBAC(authorizingContext);
                    // 最后验数据权限
                    if(dataAccessPhased == Phased.after) {
                        authorizingHandler.handDataAccess(authorizingContext);
                    }

                }
                // 如果该接口并不需要验证任何权限,默认是开放的.
                if(!isControl) {
                    result = methodInvocation.proceed();
                }

            }
            return result;
        });

    }

    @Override
    public boolean matches(Method method, Class<?> aClass) {
        boolean support = AopUtils.findAnnotation(aClass, Controller.class) != null ||
                AopUtils.findAnnotation(aClass, Authorize.class) != null ||
                AopUtils.findAnnotation(aClass, RestController.class) != null;
        if(support && autoParser) {
            parser.parser(aClass , method);
        }
        return support;
    }

    @Override
    public void run(String... args) throws Exception {
        if(this.autoParser) {
            // todo auto parser...
        }
    }
}
