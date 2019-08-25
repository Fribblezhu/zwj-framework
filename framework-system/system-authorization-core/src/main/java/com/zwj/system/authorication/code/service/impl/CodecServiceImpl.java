package com.zwj.system.authorication.code.service.impl;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.code.entity.CodecEntity;
import com.zwj.system.authorication.code.model.CodecModel;
import com.zwj.system.authorication.code.repository.CodecRepository;
import com.zwj.system.authorication.code.service.CodecService;
import com.zwj.system.authorication.code.service.helper.CodecServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 7:43 PM
 * @description:
 */
@Service
public class CodecServiceImpl implements CodecService {

    @Autowired
    private CodecRepository codecRepository;

    @Autowired
    private CodecServiceHelper codecServiceHelper;


    @Override
    public ServiceHelper<CodecEntity, CodecModel> getServiceHelper() {
        return this.codecServiceHelper;
    }

    @Override
    public JpaRepository<CodecEntity, String> getRepository() {
        return codecRepository;
    }
}
