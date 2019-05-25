package com.zwj.framework.auth.aop;

import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.auth.annotation.RequireDataAccess;
import com.zwj.framework.auth.define.AuthorizeDefinition;
import com.zwj.framework.auth.define.EmptyAuthorizeDefinition;
import com.zwj.framework.common.aop.MethodInterceptorContext;
import com.zwj.framework.common.utils.AopUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 1:57 PM
 * @description:
 */
@Slf4j
public class DefaultAopMethodAuthorizeDefinitionParser implements AopMethodAuthorizeDefinitionParser{

    private Map<CacheKey, AuthorizeDefinition> cache = new ConcurrentHashMap<>();

    private Set<String> excludeMethodName = new HashSet<>(Arrays.asList("toString", "clone", "hashCode", "getClass"));

    private List<AopMethodAuthorizeDefinitionCustomizeParser>  customizeParsers = new ArrayList<>();

    @Override
    public AuthorizeDefinition parser(Class clazz, Method method, MethodInterceptorContext context) {
        if(excludeMethodName.contains(method.getName()))
            return null;
        CacheKey cacheKey = this.buildCacheKey(clazz, method);

        // 先从缓存中找是否已解析过
        AuthorizeDefinition definition = this.cache.get(cacheKey);

        if(definition == null)
            return null;

        if(definition instanceof EmptyAuthorizeDefinition)
            return null;

        // 优先使用自定义权限解析类
        if(!CollectionUtils.isEmpty(this.customizeParsers)) {
            return this.customizeParsers.stream().map(parser -> parser.parser(clazz, method, context))
                    .filter(Objects::nonNull)
                    .findAny().orElse(null);
        }
        // 获取被拦截方法的权限注解  @Authorize or @RequireDataAccess
        Authorize methodAuth = AopUtils.findMethodAnnotation(clazz, method, Authorize.class);
        Authorize clazzAuth = AopUtils.findAnnotation(clazz, Authorize.class);
        RequireDataAccess methodDataAccess = AopUtils.findMethodAnnotation(clazz, method, RequireDataAccess.class);
        RequireDataAccess clazzDataAccess = AopUtils.findAnnotation(clazz, RequireDataAccess.class);

        // 若类和方法中没有任何权限注解或类中注解了ignore=true，则缓存为EmptyAuthorizeDefinition.
        if(null == methodAuth && null == methodDataAccess && null == clazzAuth && null == clazzDataAccess ) {
            this.cache.put(cacheKey, new EmptyAuthorizeDefinition());
            return null;
        }
        if((null != clazzAuth && clazzAuth.ignore()) && (null != clazzDataAccess && clazzDataAccess.ignore() ) ) {
            this.cache.put(cacheKey, new EmptyAuthorizeDefinition());
            return null;
        }

        // 开始解析
        synchronized (cache) {
            // todo do parser ..
            return null;
        }

    }

    @Override
    public List<AuthorizeDefinition> getAllParser() {
        return new ArrayList<>(this.cache.values());
    }

    public void destroy() {
        this.cache.clear();
    }

    private CacheKey buildCacheKey(Class clazz, Method method) {
        return new CacheKey(ClassUtils.getUserClass(clazz), method);
    }


    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    private class CacheKey {

        private Class clazz;

        private Method method;

        public CacheKey(Class clazz, Method method) {
            this.clazz = clazz;
            this.method = method;
        }

        @Override
        public int hashCode() {
            return Arrays.asList(clazz, method).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return obj!=null && obj.hashCode() == this.hashCode();
        }
    }
}
