package com.zwj.framework.common.controller;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.DeleteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.zwj.framework.common.controller.message.ResponseMessage.success;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 11:24 AM
 * @description:
 */
@RestController
public interface DeleteController<PK, T extends GenericEntity<PK>,M extends Model> extends GenericController<PK, T, M>{

    DeleteService<PK, T, M> getService();

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
