package com.zwj.system.authorication.user.web;

import com.zwj.framework.common.controller.CURDController;
import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.user.entity.UserEntity;
import com.zwj.system.authorication.user.model.UserModel;
import com.zwj.system.authorication.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 5:43 PM
 * @description:
 */
@Controller
public class UserController implements CURDController<String, UserEntity, UserModel> {

    @Autowired
    private UserService userService;

    public CURDService<String, UserEntity, UserModel> getService() {
        return userService;
    }
}
