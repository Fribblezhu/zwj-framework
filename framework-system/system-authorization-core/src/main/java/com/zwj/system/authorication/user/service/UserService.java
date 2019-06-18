package com.zwj.system.authorication.user.service;

import com.zwj.system.authorication.user.entity.UserEntity;
import com.zwj.system.authorication.user.repository.UserRepository;
import com.zwj.system.authorication.user.service.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 3:04 PM
 * @description:
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;


    public boolean checkLoginName(String loginName, Integer status) {
        return false;
    }

    public UserEntity queryByLoginName(String loginName, Integer status) {
        return this.userRepository.findOneByLoginNameAndStatus(loginName, status);
    }

    public UserEntity queryByLoginName(String loginName) {
        return this.userRepository.findOneByLoginName(loginName);
    }

    @Override
    public JpaRepository<UserEntity, String> getRepository() {
        return this.userRepository;
    }
}
