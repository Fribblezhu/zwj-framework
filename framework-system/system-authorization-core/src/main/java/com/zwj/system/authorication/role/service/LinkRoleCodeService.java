package com.zwj.system.authorication.role.service;

import com.zwj.system.authorication.role.repository.LinkRoleCodeRepository;
import com.zwj.system.authorication.role.service.interf.ILinkRoleCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 2:41 PM
 * @description:
 */
@Service
public class LinkRoleCodeService implements ILinkRoleCodeService {


    @Autowired
    private LinkRoleCodeRepository roleCodeRepository;

    @Override
    public LinkRoleCodeRepository getRepository() {
        return roleCodeRepository;
    }
}
