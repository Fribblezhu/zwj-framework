package com.zwj.framework.auth.jwt;

import lombok.Getter;
import lombok.Setter;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * jwt配置类,可参照 {@Link JwtAutoConfiguration }
 *
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 6:30 PM
 * @description:
 */
@Getter
@Setter
public class JwtConfig {

    private String id = "jwt-id";

    private String secret = Base64.encodeBase64String("jwt-secret".getBytes());

    private int ttl = 60 * 60 * 1000;

    private int refreshTtl = 12 * 60 * 60 * 1200;

    public SecretKey generateSecretKey() {
        byte[] encodeKey = Base64.decodeBase64(secret);
        return new SecretKeySpec(encodeKey, 0, secret.length(), "AES");
    }



}
