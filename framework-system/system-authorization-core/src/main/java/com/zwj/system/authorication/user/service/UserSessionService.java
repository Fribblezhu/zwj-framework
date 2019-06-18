package com.zwj.system.authorication.user.service;

import com.zwj.system.authorication.user.entity.UserSessionEntity;
import com.zwj.system.authorication.user.repository.UserSessionRepository;
import com.zwj.system.authorication.user.service.interf.IUserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 2:18 PM
 * @description:
 */
@Service
public class UserSessionService implements IUserSessionService {

    @Autowired
    private UserSessionRepository userSessionRepository;

    @Override
    public JpaRepository<UserSessionEntity, String> getRepository() {
        return this.userSessionRepository;
    }
}
