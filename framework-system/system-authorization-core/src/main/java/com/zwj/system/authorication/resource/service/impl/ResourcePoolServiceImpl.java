package com.zwj.system.authorication.resource.service.impl;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.resource.entity.ResourcePoolEntity;
import com.zwj.system.authorication.resource.model.ResourcePoolModel;
import com.zwj.system.authorication.resource.repository.ResourcePoolRepository;
import com.zwj.system.authorication.resource.service.ResourcePoolService;
import com.zwj.system.authorication.resource.service.helper.ResourcePoolServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 8/7/19
 * @Time: 11:16 AM
 * @description:
 */
@Service
public class ResourcePoolServiceImpl implements ResourcePoolService {

    @Autowired
    private ResourcePoolRepository resourcePoolRepository;

    @Autowired
    private ResourcePoolServiceHelper resourcePoolServiceHelper;


    @Override
    public ServiceHelper<ResourcePoolEntity, ResourcePoolModel> getServiceHelper() {
        return this.resourcePoolServiceHelper;
    }

    @Override
    public JpaRepository<ResourcePoolEntity, String> getRepository() {
        return this.resourcePoolRepository;
    }
}
