package com.zwj.framework.common.controller;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.UpdateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
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
@Controller
public interface UpdateController<PK, T extends GenericEntity<PK>, M extends Model > extends GenericController<PK, T, M>  {

    UpdateService<PK, T, M> getService();

    @ApiOperation("修改")
    @Authorize(permission = Permission.ACTION_UPDATE)
    @PutMapping("/{id.+}")
    default  ResponseMessage update(@PathVariable PK id, @RequestBody M model) {
        return success(this.getService().updateByModel(id, model));
    }


    @ApiOperation(("批量修改"))
    @Authorize(permission =  Permission.ACTION_UPDATE)
    @PutMapping("/batchUpdate")
    default ResponseMessage batchUpdate(@RequestBody Map<PK, M> requestMap) {
        this.getService().batchUpdateByModel(requestMap);
        return success();
    }



}
