package com.zwj.system.authorication.code.web;

import com.zwj.framework.common.controller.simple.GenericCURDController;
import com.zwj.system.authorication.code.entity.CodecEntity;
import com.zwj.system.authorication.code.model.CodecModel;
import com.zwj.system.authorication.code.service.CodecService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zwj
 * @Date: 8/2/19
 * @Time: 1:50 PM
 * @description:
 */
@RestController
@RequestMapping(value = "codec")
public class CodeCController extends GenericCURDController<String, CodecEntity, CodecModel, CodecService> {

    public CodeCController(CodecService service) {
        super(service);
    }

}
