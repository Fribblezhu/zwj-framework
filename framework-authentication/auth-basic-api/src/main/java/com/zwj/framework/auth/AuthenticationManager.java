package com.zwj.framework.auth;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:13 AM
 * @description:
 */
public interface AuthenticationManager {

    Authentication getByUserId(String userId);


    Authentication authenticate(AuthenticationRequest request);

}
