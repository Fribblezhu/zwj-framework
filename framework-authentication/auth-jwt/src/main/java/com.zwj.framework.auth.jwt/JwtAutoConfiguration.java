package com.zwj.framework.auth.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 6:30 PM
 * @description:
 */
@Configuration
public class JwtAutoConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "auth.jwt")
    public JwtConfig jwtConfig() { return new JwtConfig();}

    @Bean
    public JwtTokenGenerator jwtTokenGenerator(JwtConfig config) { return new JwtTokenGenerator(config);}

    @Bean
    public JwtTokenParser jwtTokenParser(JwtConfig config) { return  new JwtTokenParser(config);}


}
