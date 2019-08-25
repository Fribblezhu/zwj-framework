package com.zwj.system.authorication.system.service.impl;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.system.entity.SystemEntity;
import com.zwj.system.authorication.system.model.SystemModel;
import com.zwj.system.authorication.system.repository.SystemRepository;
import com.zwj.system.authorication.system.service.SystemService;
import com.zwj.system.authorication.system.service.helper.SystemServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 8/8/19
 * @Time: 4:23 PM
 * @description:
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemRepository repository;

    @Autowired
    private SystemServiceHelper helper;

    @Override
    public ServiceHelper<SystemEntity, SystemModel> getServiceHelper() {
        return this.helper;
    }

    @Override
    public JpaRepository<SystemEntity, String> getRepository() {
        return this.repository;
    }
}
