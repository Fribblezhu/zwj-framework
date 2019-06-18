package com.zwj.framework.auth;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:13 AM
 * @description:
 */
public interface AuthenticationManager {

    /**
     *
     * @param userId
     * @return
     */
    Authentication getByUserId(String userId);


    /**
    *
    * @param request
    * @return
    */
    Authentication authenticate(AuthenticationRequest request);

}
