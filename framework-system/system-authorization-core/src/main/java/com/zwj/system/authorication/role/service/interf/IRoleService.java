package com.zwj.system.authorication.role.service.interf;

import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.role.entity.RoleEntity;
import com.zwj.system.authorication.role.model.RoleModel;
import com.zwj.system.authorication.role.repository.RoleRepository;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 9:38 PM
 * @description:
 */
public interface IRoleService extends CURDService<String, RoleEntity, RoleModel> {


}
