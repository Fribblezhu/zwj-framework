package com.zwj.framework.auth.jwt;

import com.alibaba.fastjson.JSONObject;
import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.web.GeneratedToken;
import com.zwj.framework.auth.web.UserTokenGenerator;
import com.zwj.framework.core.id.IDGenerator;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.zwj.framework.auth.jwt.JwtAuthorizedToken.TYPE;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 6:31 PM
 * @description:
 *
 *    jwt 类型的用户令牌生成器，是 {@Link UserTokenGenerator} 的实现类.
 */
public class JwtTokenGenerator implements UserTokenGenerator {

    private JwtConfig config;

    public JwtTokenGenerator(JwtConfig config) {
        this.config = config;
    }

    private String createToken() {
        return IDGenerator.MD5.generator();
    }

    public String getSupportType() {
        return TYPE;
    }

    /**
     *   生成用户令牌,存放在
     * @param authentication  用户的身份信息
     * @return
     */
    public GeneratedToken generate(Authentication authentication) {
        final String token = this.createToken();
        String userId = authentication.getUser().getId();
        String subject = JSONObject.toJSONString(new JwtAuthorizedToken(token, userId));

        final String jwt = createJwt(config.getId(), subject, config.getTtl());

        final int ttl = config.getTtl();

        return new GeneratedToken() {
            public Map<String, Object> getResponse() {
                Map<String, Object> response = new HashMap<String, Object>();
                response.put("token", jwt);
                return  response;
            }

            public String getToken() {
                return token;
            }

            public String getType() {
                return TYPE;
            }

            public int getTimeout() {
                return ttl;
            }
        };
    }

    /**
     *  create java web token , use jjwt's JwtBuilder .
     * @param id
     * @param subject
     * @param ttl                  expired time;
     * @return
     */

    private String createJwt(String id, String subject, int ttl) {
        // 签名算法
        SignatureAlgorithm algorithm = SignatureAlgorithm.HS256;
        long nowMills = System.currentTimeMillis();
        Date now =  new Date(nowMills);
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(id)                     // 设置id
                .setSubject(subject)           // 信息实体
                .setIssuedAt(now)              // 有效起始时间
                .signWith(algorithm, config.generateSecretKey());   // 签名方式及秘钥
        if(ttl > 0) {
            Date exp = new Date(nowMills + ttl);
            jwtBuilder.setExpiration(exp);     // if you setting the jwt's time to live,
        }
        return jwtBuilder.compact();

    }
}
