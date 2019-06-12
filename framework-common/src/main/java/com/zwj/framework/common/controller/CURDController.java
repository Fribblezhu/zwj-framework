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
public interface CURDController <PK, T extends GenericEntity<PK>, M extends Model,S extends CURDService<PK, T, M>> extends
        CreateController<PK, T, M, S>, UpdateController<PK, T, M , S>, QueryController<PK, T, M, S>, DeleteController<PK, T, M , S> {






}
