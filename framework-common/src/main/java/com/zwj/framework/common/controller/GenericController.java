package com.zwj.framework.common.controller;

import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.GenericService;
/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 2:19 PM
 * @description:
 */
public interface GenericController<ID, T extends GenericEntity<ID>, M extends Model, S extends GenericService<ID ,T, M>> {

    @Authorize(ignore =  true)
    S getService();

}
