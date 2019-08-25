package com.zwj.system.authorication.code.service;

import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.code.entity.CodeEntity;
import com.zwj.system.authorication.code.model.CodeModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 4:05 PM
 * @description:
 */
public interface CodeService extends CURDService<String, CodeEntity, CodeModel> {

    CodeModel classify(String id, List<String> codecIds);
}
