package com.zwj.framework.common.controller.simple;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.User;

import java.util.Optional;

/**
 * @author: zwj
 * @Date: 7/12/19
 * @Time: 5:36 PM
 * @description:
 */
public class GenericController {

    /**
     *
     * @return  返回当然用户的Optional对象.
     */
    public Optional<User> getCurrentUser() {
        return Authentication.current().map(Authentication::getUser);
    }

}
