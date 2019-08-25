package com.zwj.system.authorication.resource.service.helper;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.resource.entity.ResourcePoolEntity;
import com.zwj.system.authorication.resource.model.ResourcePoolModel;
import org.springframework.stereotype.Component;

/**
 * @author: zwj
 * @Date: 8/7/19
 * @Time: 10:36 AM
 * @description:
 */
@Component
public class ResourcePoolServiceHelper implements ServiceHelper<ResourcePoolEntity,ResourcePoolModel> {

    @Override
    public ResourcePoolEntity modelToEntity(ResourcePoolModel model) {
        ResourcePoolEntity entity = new ResourcePoolEntity();
        entity.setId(model.getId());
        return entity;
    }

    @Override
    public ResourcePoolModel entityToModel(ResourcePoolEntity entity) {
        return null;
    }
}
