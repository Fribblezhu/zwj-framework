package com.zwj.framework.auth.jwt;

import com.alibaba.fastjson.JSONObject;
import com.zwj.framework.auth.web.ParsedToken;
import com.zwj.framework.auth.web.UserTokenParser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 6:31 PM
 * @description:
 */
@Slf4j
public class JwtTokenParser implements UserTokenParser {

    private JwtConfig config;

    public JwtTokenParser(JwtConfig config) {
        this.config = config;
    }

    public ParsedToken parser(HttpServletRequest request) {
        // 优先获取header中的 jwt-token
        String token = request.getHeader("jwt-token");
        if(StringUtils.isBlank(token)) {
            token = request.getHeader("Authorization");
            if(StringUtils.isNotBlank(token)) {
                if(token.contains(" ")) {
                    String[] headers = token.split("[ ]");
                    if( headers.length > 1 && (headers[0].equalsIgnoreCase("jwt") || headers[0].equalsIgnoreCase("Bearer"))) {
                        token = headers[1];
                    }else{
                        return  null;
                    }
                }
            }
        }
        // 如果有授权信息
        if(StringUtils.isNotBlank(token)) {
            try {
                Claims claims = this.parserJwt(token);
                if (claims.getExpiration().getTime() <= System.currentTimeMillis()) {
                    return null;
                }
                return JSONObject.parseObject(claims.getSubject(), ParsedToken.class);
            }catch (ExpiredJwtException e) {
                return  null;
            }catch (Exception e) {
                log.error("parser jwt token error ...");
                return null;
            }
        }
        return null;
    }

    public Claims parserJwt(String jwt) {
        return Jwts.parser()
                .setSigningKey(config.generateSecretKey())
                .parseClaimsJws(jwt).getBody();
    }
}
