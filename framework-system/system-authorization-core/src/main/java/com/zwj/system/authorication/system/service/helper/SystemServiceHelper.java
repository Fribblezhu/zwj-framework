package com.zwj.system.authorication.system.service.helper;

import com.zwj.framework.common.model.ComboBoxModel;
import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.system.entity.SystemEntity;
import com.zwj.system.authorication.system.model.SystemModel;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @author: zwj
 * @Date: 8/8/19
 * @Time: 4:27 PM
 * @description:
 */
@Component
public class SystemServiceHelper implements ServiceHelper<SystemEntity, SystemModel> {



    @Override
    public SystemEntity modelToEntity(SystemModel model) {
        SystemEntity entity = new SystemEntity();
        entity.setId(model.getId());
        entity.setName(model.getName());
        entity.setCode(model.getCode());
        entity.setLevel(model.getLevel());
        entity.setPath(model.getPath());
        entity.setSortIndex(model.getSortIndex());
        return entity;
    }

    @Override
    public SystemModel entityToModel(SystemEntity entity) {
        SystemModel model = new SystemModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setCode(entity.getCode());
        model.setLevel(entity.getLevel());
        model.setPath(entity.getPath());
        model.setSortIndex(entity.getSortIndex());
        model.setChildren(entity.getChildren().stream()
                .map(item ->
                    new ComboBoxModel(item.getId(), item.getName(), true)
                ).collect(Collectors.toList()));
        return model;
    }
}
