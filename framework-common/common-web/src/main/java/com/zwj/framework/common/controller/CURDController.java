package com.zwj.framework.common.controller;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.CURDService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 8:19 PM
 * @description:
 */
@RestController
public interface CURDController <PK, T extends GenericEntity<PK>, M extends Model> extends
        CreateController<PK, T, M>, UpdateController<PK, T, M >, QueryController<PK, T, M>, DeleteController<PK, T, M> {


    CURDService<PK, T, M> getService();

}
