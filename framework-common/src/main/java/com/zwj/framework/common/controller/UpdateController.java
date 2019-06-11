package com.zwj.framework.common.controller;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.UpdateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

import static com.zwj.framework.common.controller.message.ResponseMessage.success;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 7:48 PM
 * @description:
 */
public interface UpdateController<ID, T extends GenericEntity<ID>, M extends Model, S extends UpdateService<ID, T, M>> extends GenericController<ID, T, M, S>  {

    @ApiOperation("修改")
    @Authorize(permission = Permission.ACTION_UPDATE)
    @PutMapping("/{id.+}")
    default  ResponseMessage update(@PathVariable ID id, @RequestBody M model) {
        return success(this.getService().updateByModel(id, model));
    }


    @ApiOperation(("批量修改"))
    @Authorize(permission =  Permission.ACTION_UPDATE)
    @PutMapping("/batchUpdate")
    default ResponseMessage batchUpdate(@RequestBody Map<ID, M> requestMap) {
        this.getService().batchUpdateByModel(requestMap);
        return success();
    }



}
