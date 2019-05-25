package com.zwj.framework.auth;

import com.zwj.framework.auth.exception.AccessDenyException;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:14 AM
 * @description:
 */
public interface AuthenticationPredicate extends Predicate<Authentication> {

    static AuthenticationPredicate has(String permissionExpression) {
        return AuthenticationUtils.createPredicate(permissionExpression);
    }

    default boolean test() {
        return Authentication.current().map(this::test).orElse(false);
    }

    @Override
    default AuthenticationPredicate and(Predicate<? super Authentication> other) {
        Objects.requireNonNull(other);
        return t -> test(t) && other.test(t);
    }

    @Override
    default AuthenticationPredicate or(Predicate<? super Authentication> other) {
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
    }

    default void assertHas(Authentication authentication) {
        if(!test(authentication))
            throw new AccessDenyException();
    }

}
