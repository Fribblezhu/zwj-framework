package com.zwj.framework.common.controller.simple;

import com.zwj.framework.common.controller.CURDController;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.CURDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zwj
 * @Date: 7/12/19
 * @Time: 5:25 PM
 * @description:
 */
@RestController
public class GenericCURDController<PK, T extends GenericEntity<PK>, M extends Model, S extends CURDService<PK, T, M>>
        extends GenericController implements CURDController<PK, T, M> {

    private final S service;

    @Autowired
    public GenericCURDController(S service) {
        this.service = service;
    }


    @Override
    public S getService() {
        return this.service;
    }

}
