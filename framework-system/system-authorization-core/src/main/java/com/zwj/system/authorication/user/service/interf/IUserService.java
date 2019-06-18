package com.zwj.system.authorication.user.service.interf;

import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.user.entity.UserEntity;
import com.zwj.system.authorication.user.model.UserModel;
import com.zwj.system.authorication.user.repository.UserRepository;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 2:57 PM
 * @description:
 */
public interface IUserService extends CURDService<String, UserEntity, UserModel> {

    boolean checkLoginName(String loginName, Integer status);

    UserEntity queryByLoginName(String loginName, Integer status);


}
