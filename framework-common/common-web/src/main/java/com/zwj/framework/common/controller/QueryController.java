package com.zwj.framework.common.controller;

import com.zwj.framework.auth.Permission;
import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.controller.message.RequestPageDTO;
import com.zwj.framework.common.controller.message.ResponseMessage;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.exception.EntityNotFoundException;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.QueryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.zwj.framework.common.controller.message.ResponseMessage.success;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 2:27 PM
 * @description:
 */
@RestController
public interface QueryController<PK, T extends GenericEntity<PK>, M extends Model> extends GenericController<PK, T, M>{

    QueryService<PK, T, M> getService();

    @Authorize(permission = Permission.ACTION_GET)
    @ApiOperation(value = "根据主键查询单个实体")
    @GetMapping(value = "/{id:.+}")
    default ResponseMessage getByPrimaryKey(@PathVariable(name = "id") PK PK) {
        return success(this.assertNotNull(this.getService().getByPrimaryKey(PK)));
    }

    @Authorize(permission = Permission.ACTION_GET)
    @PostMapping(value = "/getByPrimaryKeys")
    @ApiOperation(value = "根据多个主键查询多个实体")
    default ResponseMessage getByPrimaryKeys(@RequestBody List<PK> ids) {
        return success(this.assertNotNull(this.getService().getByPrimaryKeyList(ids)));
    }

    @Authorize(permission = Permission.ACTION_QUERY)
    @PostMapping(value = "/query-list")
    @ApiOperation(value = "根据实体类查找")
    default ResponseMessage queryList(@RequestBody M model) {
        return success(this.assertNotNull(this.getService().queryByModel(model)));
    }

    @Authorize(permission = Permission.ACTION_QUERY)
    @PostMapping(value = "query-page")
    @ApiOperation(value = "根据实体类分页查找")
    default ResponseMessage queryPage(@RequestBody() RequestPageDTO<M> requestPageDTO) {
        return success(this.getService().queryPageByModel(requestPageDTO.getPageParameter(),
                        requestPageDTO.getModel()));
    }

    @Authorize(ignore = true)
    default <O> O assertNotNull(O obj) {
        if (null == obj) {
            throw new EntityNotFoundException();
        }
        return obj;
    }


}
