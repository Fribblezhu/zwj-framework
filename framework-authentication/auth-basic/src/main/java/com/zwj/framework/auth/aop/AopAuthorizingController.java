package com.zwj.framework.auth.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 1:51 PM
 * @description:
 */
@Slf4j
public class AopAuthorizingController {

    private  ApplicationEventPublisher publisher;

    private DefaultAopMethodAuthorizeDefinitionParser parser;


}
