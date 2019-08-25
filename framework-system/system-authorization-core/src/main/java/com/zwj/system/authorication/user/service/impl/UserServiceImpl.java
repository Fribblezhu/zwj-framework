package com.zwj.system.authorication.user.service.impl;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.user.entity.UserEntity;
import com.zwj.system.authorication.user.model.UserModel;
import com.zwj.system.authorication.user.repository.UserRepository;
import com.zwj.system.authorication.user.service.UserService;
import com.zwj.system.authorication.user.service.helper.UserServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 8/7/19
 * @Time: 8:58 PM
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServiceHelper userServiceHelper;


    @Override
    public ServiceHelper<UserEntity, UserModel> getServiceHelper() {
        return this.userServiceHelper;
    }

    @Override
    public JpaRepository<UserEntity, String> getRepository() {
        return this.userRepository;
    }
}
