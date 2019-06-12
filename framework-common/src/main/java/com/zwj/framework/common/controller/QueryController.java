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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

import static com.zwj.framework.common.controller.message.ResponseMessage.success;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 2:27 PM
 * @description:
 */
public interface QueryController<PK, T extends GenericEntity<PK>, M extends Model,S extends QueryService<PK, T ,M>> extends GenericController<PK, T, M, S>{

    @Authorize(permission = Permission.ACTION_GET)
    @ApiOperation(value = "根据主键查询单个实体")
    @GetMapping(value = "/{id:.+}")
    default ResponseMessage getByPrimaryKey(@PathVariable PK PK) {
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
    default ResponseMessage queryList(@RequestBody T entity) {
        return success(this.assertNotNull(this.getService().queryByEntity(entity)));
    }

    @Authorize(permission = Permission.ACTION_QUERY)
    @PostMapping(value = "query-page")
    @ApiOperation(value = "根据实体类分页查找")
    default ResponseMessage queryPage(@RequestBody RequestPageDTO<T> requestPageDTO) {
        return success(this.assertNotNull(this.getService().queryPageByEntity(requestPageDTO)));
    }

    @Authorize(ignore = true)
    default <O> O assertNotNull(O obj) {
        if (null == obj) {
            throw new EntityNotFoundException();
        }
        return obj;
    }


}
