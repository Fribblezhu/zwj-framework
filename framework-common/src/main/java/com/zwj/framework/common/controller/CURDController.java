package com.zwj.framework.common.controller;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.CURDService;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 8:19 PM
 * @description:
 */
public interface CURDController <ID, T extends GenericEntity<ID>, M extends Model,S extends CURDService<ID, T, M>> extends
        CreateController<ID, T, M, S>, UpdateController<ID, T, M , S>, QueryController<ID, T, M, S>, DeleteController<ID, T, M , S> {






}
