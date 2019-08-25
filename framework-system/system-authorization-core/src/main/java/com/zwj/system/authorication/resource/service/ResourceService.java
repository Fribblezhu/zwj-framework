package com.zwj.system.authorication.resource.service;

import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.resource.entity.ResourceEntity;
import com.zwj.system.authorication.resource.model.ResourceModel;
import com.zwj.system.authorication.resource.model.ResourcePoolModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 8:33 PM
 * @description:
 */
public interface ResourceService  extends CURDService<String, ResourceEntity, ResourceModel> {
    List<ResourceModel> queryByResourcePool(ResourcePoolModel resourcePoolModel);
}
