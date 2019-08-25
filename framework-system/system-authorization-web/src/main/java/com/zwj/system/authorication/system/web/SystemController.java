package com.zwj.system.authorication.system.web;

import com.zwj.framework.common.controller.simple.GenericCURDController;
import com.zwj.system.authorication.system.entity.SystemEntity;
import com.zwj.system.authorication.system.model.SystemModel;
import com.zwj.system.authorication.system.service.SystemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zwj
 * @Date: 7/12/19
 * @Time: 4:26 PM
 * @description:
 */
@RestController
@RequestMapping("system")
public class SystemController extends GenericCURDController<String, SystemEntity, SystemModel, SystemService> {

    public SystemController(SystemService service) {
        super(service);
    }

}
