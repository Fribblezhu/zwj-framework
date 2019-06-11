package com.zwj.framework.auth.web;

import com.zwj.framework.auth.Authentication;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 10:05 PM
 * @description:
 *    用户令牌生成器，用于在授权时生成token令牌.
 */
public interface UserTokenGenerator {


    String TOKEN_TYPE_SESSION_ID = "SESSION_ID";

    String getSupportType();

    GeneratedToken generate(Authentication authentication);

}
