package com.zwj.framework.auth;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:10 AM
 * @description:
 */
public interface AuthenticationInitializeService {

    Authentication initialize(String userId);

}
