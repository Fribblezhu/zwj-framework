package com.zwj.system.authorication.runner;


import com.zwj.system.authorication.core.interf.IAuthCoreBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * @author: zwj
 * @Date: 6/23/19
 * @Time: 3:13 PM
 * @description:
 */
@Component
@Order(value = 1)     // 运行优先级
public class CheckDataBasesRunner implements ApplicationRunner {



    @Value("${auth.salt}")
    private String salt;

    @Value("${auth.super.login-name}")
    private String SUPER_ADMIN_LOGIN_NAME;

    @Value(("${auth.super.password}"))
    private String SUPER_ADMIN_PASSWORD;

    @Value("${auth.super.email}")
    private String SUPER_ADMIN_EMAIL;

    @Autowired
    private IAuthCoreBiz authCoreBiz;

    /**
     *
     * @param args
     * @throws Exception
     */
    public void run(ApplicationArguments args) throws Exception {
       // todo 检查系统数据库是否完整
    }
}
