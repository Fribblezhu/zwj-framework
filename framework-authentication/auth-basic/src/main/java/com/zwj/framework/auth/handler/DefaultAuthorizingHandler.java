package com.zwj.framework.auth.handler;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.Role;
import com.zwj.framework.auth.annotation.Logical;
import com.zwj.framework.auth.define.AuthorizeDefinition;
import com.zwj.framework.auth.define.AuthorizingContext;
import com.zwj.framework.auth.define.DataAccessDefinition;
import com.zwj.framework.auth.exception.AccessDenyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author: zwj
 * @Date: 5/27/19
 * @Time: 6:35 PM
 * @description:
 */
public class DefaultAuthorizingHandler implements AuthorizingHandler {

    Logger logger = LoggerFactory.getLogger(DefaultAuthorizingHandler.class.getName());
    /**
     *  实现Handler的权限验证,
     * @param context
     */
    @Override
    public void handRBAC(AuthorizingContext context) {
        this.doHandRBAC(context.getAuthentication(), context.getDefinition());
    }


    @Override
    public void handDataAccess(AuthorizingContext context) {
        this.doHandDataAccess(context.getAuthentication(), context.getDefinition().getDataAccessDefinition());
    }

    protected void doHandRBAC(Authentication authentication, AuthorizeDefinition definition) {
        // 当涉及多个权限定义时的逻辑合并操作
        Logical logical = definition.getLogical() == Logical.DEFAULT ? Logical.OR : definition.getLogical();
        boolean isLogicalOr = logical == Logical.OR;

        // 获取接口权限定义的 permission, actions, roles, users
        Set<String> permissionsDef = definition.getPermissions();
        Set<String> actionsDef = definition.getActions();
        Set<String> rolesDef = definition.getRoles();
        Set<String> usersDef = definition.getUsers();

        boolean access = false;

        // 如果接口定义了权限
        if (!permissionsDef.isEmpty()) {
            if (logger.isInfoEnabled()) {
                logger.info("验证权限: {}", permissionsDef.toString());
            }
            List<Permission> permissions = authentication.getPermissions().stream()
                    .filter(permission -> {
                        if (!permissionsDef.contains(permission.getId()))
                            return false;
                        if (actionsDef.isEmpty())
                            return true;
                        if (logger.isInfoEnabled()) {
                            logger.info("验证操作: {}", actionsDef.toString());
                        }
                        List<String> actions = permission.getActions().stream()
                                .filter(actionsDef::contains)
                                .collect(Collectors.toList());
                        if (actions.isEmpty())
                            return false;
                        // 如果是逻辑或直接返回true,如果是逻辑与则需要拥有全部操作权限.
                        return isLogicalOr || actions.containsAll(actionsDef);
                    }).collect(Collectors.toList());
            access = !permissions.isEmpty() && (isLogicalOr || permissions.size() == permissionsDef.size());
        }
        if (!rolesDef.isEmpty()) {
            if (logger.isInfoEnabled()) {
                logger.info("验证角色: {}", rolesDef.toString());
            }
            // 如果是逻辑or, 则authentication中只需包含任意一个角色
            // 如果是逻辑and, 则authentication中必须包含所有角色
            Set<String> roles = authentication.getRoles().stream().map(Role::getCode).collect(Collectors.toSet());
            Function<Predicate<String>, Boolean> func = isLogicalOr
                    ? rolesDef.stream()::anyMatch
                    : rolesDef.stream()::allMatch;
            access = func.apply(roles::contains);
        }
        if (!usersDef.isEmpty()) {
            if (logger.isInfoEnabled()) {
                logger.info("验证用户: {}", usersDef.toString());
            }
            Function<Predicate<String>, Boolean> func = isLogicalOr
                    ? usersDef.stream()::anyMatch
                    : usersDef.stream()::allMatch;
            access = func.apply(authentication.getUser().getUsername()::equals);
        }
        if (!access) {
            throw new AccessDenyException();
        }


    }

    private void doHandDataAccess(Authentication authentication, DataAccessDefinition definition) {


    }
}
