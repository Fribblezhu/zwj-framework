package com.zwj.system.authorication.resource.web;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.controller.simple.GenericCURDController;
import com.zwj.system.authorication.resource.entity.ResourceEntity;
import com.zwj.system.authorication.resource.model.ResourceModel;
import com.zwj.system.authorication.resource.model.ResourcePoolModel;
import com.zwj.system.authorication.resource.service.ResourceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


/**
 * @author: zwj
 * @Date: 7/16/19
 * @Time: 10:48 AM
 * @description:
 */
@RestController
@RequestMapping("resource")
public class ResourceController extends GenericCURDController<String,ResourceEntity,ResourceModel, ResourceService> {

    public ResourceController(ResourceService service) {
        super(service);
    }


    @PostMapping("/queryByResourcePool")
    @ApiOperation(value = "获取资源池的资源")
    @Authorize(permission = Permission.ACTION_QUERY)
    public ResponseMessage queryByResourcePool(@RequestBody ResourcePoolModel resourcePoolModel) {
        return ResponseMessage.success(this.getService().queryByResourcePool(resourcePoolModel));
    }
}
