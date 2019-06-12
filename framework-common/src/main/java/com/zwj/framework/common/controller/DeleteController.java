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
public interface DeleteController<PK, T extends GenericEntity<PK>,M extends Model,S extends DeleteService<PK, T, M>> extends GenericController<PK, T, M, S>{

    @Authorize(permission = Permission.ACTION_DELETE)
    @PostMapping(value = "/deleteByPrimaryKey")
    @ApiOperation("")
    default ResponseMessage deleteByPrimaryKey(@RequestBody PK PK) {
        this.getService().deleteByPrimaryKey(PK);
        return success();
    }

    @Authorize(permission = Permission.ACTION_DELETE)
    @ApiOperation("")
    @PostMapping
    default ResponseMessage deleteByPrimaryKeys(@RequestBody List<PK> PKS) {
        this.getService().deleteByPrimaryKeys(PKS);
        return success();
    }

}
