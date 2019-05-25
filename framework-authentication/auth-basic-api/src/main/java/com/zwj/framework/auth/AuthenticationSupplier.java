package com.zwj.framework.auth;

import java.util.function.Supplier;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:01 AM
 * @description:
 */
public interface AuthenticationSupplier extends Supplier<Authentication> {

    Authentication get(String userId);

}
