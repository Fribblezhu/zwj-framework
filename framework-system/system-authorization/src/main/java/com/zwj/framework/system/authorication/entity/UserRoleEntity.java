package com.zwj.framework.system.authorication.entity;

import com.zwj.framework.common.entity.GenericEntity;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 10:35 AM
 * @description:
 */
public interface UserRoleEntity extends GenericEntity<String> {

    public String getRoleId() ;

    public void setRoleId(String roleId);

    public String getUserId();

    public void setUserId(String userId) ;

}
