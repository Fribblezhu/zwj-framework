package com.zwj.system.authorication.code.service.impl;

import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.code.entity.CodecEntity;
import com.zwj.system.authorication.code.entity.CodeEntity;
import com.zwj.system.authorication.code.model.CodeModel;
import com.zwj.system.authorication.code.repository.CodecRepository;
import com.zwj.system.authorication.code.repository.CodeRepository;
import com.zwj.system.authorication.code.service.CodeService;
import com.zwj.system.authorication.code.service.helper.CodeServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.List;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 7:28 PM
 * @description:
 */
@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeRepository codeRepository;

    @Autowired
    private CodecRepository codecRepository;

    @Autowired
    private CodeServiceHelper codeServiceHelper;

    @Override
    public CodeModel classify(String id, List<String> codecIds) {
        List<CodecEntity> codeCEntities = this.codecRepository.findAllById(codecIds);
        CodeEntity codeEntity = this.codeRepository.findById(id).orElse(null);
        Assert.notNull(codeEntity, "无法对空编码进行分类.");
        codeEntity.setCodecList(new HashSet<>(codeCEntities));
        codeEntity = this.codeRepository.saveAndFlush(codeEntity);
        return this.codeServiceHelper.entityToModel(codeEntity);
    }


    @Override
    public ServiceHelper<CodeEntity, CodeModel> getServiceHelper() {
        return this.codeServiceHelper;
    }

    @Override
    public JpaRepository<CodeEntity, String> getRepository() {
        return codeRepository;
    }

}
