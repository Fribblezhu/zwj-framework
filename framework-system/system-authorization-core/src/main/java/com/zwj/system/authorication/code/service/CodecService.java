package com.zwj.system.authorication.code.service;

import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.code.entity.CodecEntity;
import com.zwj.system.authorication.code.model.CodecModel;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 8/2/19
 * @Time: 1:47 PM
 * @description:
 */
public interface CodecService extends CURDService<String, CodecEntity, CodecModel> {

}
