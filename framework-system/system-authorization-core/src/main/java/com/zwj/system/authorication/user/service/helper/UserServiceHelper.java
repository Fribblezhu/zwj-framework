package com.zwj.system.authorication.user.service.helper;

import com.zwj.framework.common.data.Gender;
import com.zwj.framework.common.service.helper.ServiceHelper;
import com.zwj.system.authorication.user.entity.UserEntity;
import com.zwj.system.authorication.user.model.UserModel;
import org.springframework.stereotype.Component;

/**
 * @author: zwj
 * @Date: 8/7/19
 * @Time: 9:01 PM
 * @description:
 */
@Component
public class UserServiceHelper  implements ServiceHelper<UserEntity, UserModel> {

    @Override
    public UserEntity modelToEntity(UserModel model) {
        UserEntity entity = new UserEntity();
        entity.setId(model.getId());
        entity.setUsername(model.getUsername());
        entity.setLoginName(model.getLoginName());
        entity.setAbbreviation(model.getAbbreviation());
        entity.setGender(Gender.valueOf(model.getGender()));
        entity.setAge(model.getAge());
        entity.setPicUrl(model.getPicUrl());
        entity.setMobile(model.getMobile());
        entity.setEmail(model.getEmail());
        entity.setTelephone(model.getTelephone());
        entity.setBeginValidTime(model.getBeginValidTime());
        entity.setEndValidTime(model.getEndValidTime());
        return entity;
    }

    @Override
    public UserModel entityToModel(UserEntity entity) {
        UserModel model = new UserModel();
        model.setId(entity.getId());
        model.setUsername(entity.getUsername());
        model.setLoginName(entity.getLoginName());
        model.setGender(entity.getGender().value());
        model.setAbbreviation(entity.getAbbreviation());
        model.setAge(entity.getAge());
        model.setEmail(entity.getEmail());
        model.setPicUrl(entity.getPicUrl());
        model.setMobile(entity.getMobile());
        model.setTelephone(entity.getTelephone());
        model.setBeginValidTime(entity.getBeginValidTime());
        model.setEndValidTime(entity.getEndValidTime());
        return model;
    }
}
