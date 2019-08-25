package com.zwj.system.authorication.code.service.helper;

import com.zwj.framework.common.model.ComboBoxModel;
import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.code.entity.CodeEntity;
import com.zwj.system.authorication.code.entity.CodecEntity;
import com.zwj.system.authorication.code.model.CodeModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 7:32 PM
 * @description:
 */
@Component
public class CodeServiceHelper implements ServiceHelper<CodeEntity, CodeModel> {
    @Override
    public CodeEntity modelToEntity(CodeModel model) {
        CodeEntity entity = new CodeEntity();
        entity.setId(model.getId());
        entity.setCode(model.getCode());
        entity.setName(model.getName());
        entity.setDescription(model.getDescription());
        if(model.getCodecList() != null && model.getCodecList().size() >0) {
            entity.setCodecList(model.getCodecList().stream().map(
                    item -> {
                        CodecEntity c = new CodecEntity();
                        c.setId(item.getValue());
                        c.setName(item.getLabel());
                        return c;
                    }
            ).collect(Collectors.toSet()));
        } else {
            entity.setCodecList(new HashSet<>());
        }
        return entity;
    }

    @Override
    public CodeModel entityToModel(CodeEntity entity) {
        CodeModel model = new CodeModel();
        model.setId(entity.getId());
        model.setCode(entity.getCode());
        model.setName(entity.getName());
        model.setDescription(entity.getDescription());
        if(entity.getCodecList() != null && entity.getCodecList().size()>0) {
            model.setCodecList(entity.getCodecList().stream().map(item ->
                    new ComboBoxModel(item.getId(), item.getName(), true)
            ).collect(Collectors.toList()));
        } else {
            model.setCodecList(new ArrayList<>());
        }
        return model;
    }
}
