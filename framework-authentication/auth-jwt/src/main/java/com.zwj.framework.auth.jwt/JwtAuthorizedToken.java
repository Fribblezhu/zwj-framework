package com.zwj.framework.auth.jwt;

import com.zwj.framework.auth.web.AuthorizedToken;
import lombok.AllArgsConstructor;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 5:59 PM
 * @description:
 */
@AllArgsConstructor
public class JwtAuthorizedToken implements AuthorizedToken {

    public static final String TYPE = "jwt";

    private String token;
    private String userId;

    public String getUserId() {
        return this.userId;
    }

    public long getMaxInactiveInternal() {
        return -1;
    }

    public String getToken() {
        return this.token;
    }

    public String getType() {
        return JwtAuthorizedToken.TYPE;
    }
}
