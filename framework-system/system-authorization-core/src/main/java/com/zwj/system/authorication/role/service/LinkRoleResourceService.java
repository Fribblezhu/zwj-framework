package com.zwj.system.authorication.role.service;

import com.zwj.system.authorication.role.repository.LinkRoleResourceRepository;
import com.zwj.system.authorication.role.service.interf.ILinkRoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 3:05 PM
 * @description:
 */
@Service
public class LinkRoleResourceService implements ILinkRoleResourceService {

    @Autowired
    private LinkRoleResourceRepository roleResourceRepository;

    @Override
    public LinkRoleResourceRepository getRepository() {
        return roleResourceRepository;
    }
}
