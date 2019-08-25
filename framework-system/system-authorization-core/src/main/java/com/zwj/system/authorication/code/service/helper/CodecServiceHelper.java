package com.zwj.system.authorication.code.service.helper;

import com.zwj.framework.common.model.ComboBoxModel;
import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.code.entity.CodeEntity;
import com.zwj.system.authorication.code.entity.CodecEntity;
import com.zwj.system.authorication.code.model.CodecModel;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.stream.Collectors;

/**
 * @author: zwj
 * @Date: 8/6/19
 * @Time: 7:48 PM
 * @description:
 */
@Component
public class CodecServiceHelper implements ServiceHelper<CodecEntity, CodecModel> {

    @Override
    public CodecEntity modelToEntity(@NotNull CodecModel model) {
        CodecEntity entity = new CodecEntity();
        entity.setId(model.getId());
        entity.setCode(model.getCode());
        entity.setName(model.getName());
        entity.setSystemId(model.getSystemId());
        entity.setDescription(model.getDescription());
        if(model.getCodeList() != null && model.getCodeList().size() >0) {
            entity.setCodeList(model.getCodeList().stream().map(
                    item -> {
                        CodeEntity c = new CodeEntity();
                        c.setId(item.getValue());
                        c.setName(item.getLabel());
                        return c;
                    }
            ).collect(Collectors.toSet()));
        }
        return entity;
    }

    @Override
    public CodecModel entityToModel(@NotNull CodecEntity entity) {
        CodecModel model = new CodecModel();
        model.setCode(entity.getCode());
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setSystemId(entity.getSystemId());
        model.setDescription(entity.getDescription());
        if(entity.getCodeList() != null && entity.getCodeList().size() >0) {
            model.setCodeList(entity.getCodeList().stream().map(
                    item -> new ComboBoxModel(item.getId(), item.getName(), true)
            ).collect(Collectors.toList()));
        }
        return model;
    }
}
