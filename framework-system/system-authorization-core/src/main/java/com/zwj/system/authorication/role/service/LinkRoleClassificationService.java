package com.zwj.system.authorication.role.service;

import com.zwj.system.authorication.role.entity.LinkRoleClassificationEntity;
import com.zwj.system.authorication.role.repository.LinkRoleClassificationRepository;
import com.zwj.system.authorication.role.service.interf.ILinkRoleClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 1:59 PM
 * @description:
 */
@Service
public class LinkRoleClassificationService implements ILinkRoleClassificationService {

    @Autowired
    private LinkRoleClassificationRepository linkRoleClassificationRepository;

    @Override
    public JpaRepository<LinkRoleClassificationEntity, String> getRepository() {
        return this.linkRoleClassificationRepository;
    }
}
