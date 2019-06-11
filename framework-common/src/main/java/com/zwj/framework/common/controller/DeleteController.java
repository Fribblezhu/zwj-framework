package com.zwj.framework.common.controller;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.DeleteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static com.zwj.framework.common.controller.message.ResponseMessage.success;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 11:24 AM
 * @description:
 */
public interface DeleteController<ID, T extends GenericEntity<ID>,M extends Model,S extends DeleteService<ID, T, M>> extends GenericController<ID, T, M, S>{

    @Authorize(permission = Permission.ACTION_DELETE)
    @PostMapping(value = "/deleteByPrimaryKey")
    @ApiOperation("")
    default ResponseMessage deleteByPrimaryKey(@RequestBody ID ID) {
        this.getService().deleteByPrimaryKey(ID);
        return success();
    }

    @Authorize(permission = Permission.ACTION_DELETE)
    @ApiOperation("")
    @PostMapping
    default ResponseMessage deleteByPrimaryKeys(@RequestBody List<ID> IDS) {
        this.getService().deleteByPrimaryKeys(IDS);
        return success();
    }

}
