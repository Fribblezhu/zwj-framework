package com.zwj.system.authorication.user.web;



import com.zwj.framework.common.controller.simple.GenericCURDController;
import com.zwj.system.authorication.user.entity.UserEntity;
import com.zwj.system.authorication.user.model.UserModel;
import com.zwj.system.authorication.user.service.UserService;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 5:43 PM
 * @description:
 */
@RestController
@RequestMapping("user")
public class UserController extends GenericCURDController<String,UserEntity,UserModel,UserService> {

    public UserController(UserService service) {
        super(service);
    }

}
