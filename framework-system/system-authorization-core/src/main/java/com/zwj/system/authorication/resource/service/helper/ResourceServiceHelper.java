package com.zwj.system.authorication.resource.service.helper;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.resource.entity.ResourceEntity;
import com.zwj.system.authorication.resource.model.ResourceModel;
import org.springframework.stereotype.Component;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 8:34 PM
 * @description:
 */
@Component
public class ResourceServiceHelper implements ServiceHelper<ResourceEntity, ResourceModel> {
    @Override
    public ResourceEntity modelToEntity(ResourceModel model) {
        ResourceEntity entity = new ResourceEntity();
        entity.setCode(model.getCode());
        entity.setImageUrl(model.getImageUrl());
        entity.setName(model.getName());
        entity.setId(model.getId());
        entity.setComments(model.getContents());
        return entity;
    }

    @Override
    public ResourceModel entityToModel(ResourceEntity entity) {
        ResourceModel model = new ResourceModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setCode(entity.getCode());
        model.setContents(entity.getComments());
        model.setUrl(entity.getUrl());
        model.setImageUrl(entity.getImageUrl());
        return model;
    }

}
