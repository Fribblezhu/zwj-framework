package com.zwj.system.authorication.resource.service.impl;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.resource.entity.ResourceEntity;
import com.zwj.system.authorication.resource.entity.ResourcePoolEntity;
import com.zwj.system.authorication.resource.model.ResourceModel;
import com.zwj.system.authorication.resource.model.ResourcePoolModel;
import com.zwj.system.authorication.resource.repository.ResourceRepository;
import com.zwj.system.authorication.resource.service.ResourceService;
import com.zwj.system.authorication.resource.service.helper.ResourcePoolServiceHelper;
import com.zwj.system.authorication.resource.service.helper.ResourceServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 8:33 PM
 * @description:
 */
@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private ResourceServiceHelper resourceServiceHelper;

    @Autowired
    private ResourcePoolServiceHelper resourcePoolServiceHelper;

    @Override
    public ServiceHelper<ResourceEntity, ResourceModel> getServiceHelper() {
        return this.resourceServiceHelper;
    }

    @Override
    public JpaRepository<ResourceEntity, String> getRepository() {
        return this.resourceRepository;
    }

    @Override
    public List<ResourceModel> queryByResourcePool(@NotNull ResourcePoolModel resourcePoolModel) {
        ResourcePoolEntity resourcePoolEntity = this.resourcePoolServiceHelper.modelToEntity(resourcePoolModel);
        List<ResourceEntity>  entities = this.resourceRepository.findAllByResourcePool(resourcePoolEntity);
        Collections.sort(entities);
        return this.resourceServiceHelper.batchEntityToModel(entities);
    }
}
