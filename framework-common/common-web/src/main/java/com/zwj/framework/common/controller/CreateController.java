package com.zwj.framework.common.controller;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.CreateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.zwj.framework.common.controller.message.ResponseMessage.success;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 1:53 PM
 * @description:
 */
@RestController
public interface CreateController<PK, T extends GenericEntity<PK>, M extends  Model> extends GenericController<PK, T, M> {

    /**
    *
    * @return
    */
    CreateService<PK, T, M> getService();

    @Authorize(permission = Permission.ACTION_ADD)
    @PostMapping("/create")
    @ApiOperation("新增")
    default ResponseMessage create(@RequestBody M data) {
        return success(this.getService().create(data, null));
    }




}
