package com.zwj.system.authorication.role.service;

import com.zwj.system.authorication.role.entity.RoleEntity;
import com.zwj.system.authorication.role.repository.RoleRepository;
import com.zwj.system.authorication.role.service.interf.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 9:38 PM
 * @description:
 */
@Service
public class RoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public JpaRepository<RoleEntity, String> getRepository() {
        return this.roleRepository;
    }
}
