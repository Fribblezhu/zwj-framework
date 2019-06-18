package com.zwj.framework.common.controller;

import com.zwj.framework.auth.annotation.Authorize;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.GenericService;
import org.springframework.stereotype.Controller;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 2:19 PM
 * @description:
 */
@Controller
public interface GenericController<PK, T extends GenericEntity<PK>, M extends Model> {

    @Authorize(ignore =  true)
    GenericService<PK ,T, M> getService();

}
