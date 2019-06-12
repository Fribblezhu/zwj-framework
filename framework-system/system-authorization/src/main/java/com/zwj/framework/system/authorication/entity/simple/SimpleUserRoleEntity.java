package com.zwj.framework.system.authorication.entity.simple;

import com.zwj.framework.system.authorication.entity.UserRoleEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 10:35 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class SimpleUserRoleEntity implements UserRoleEntity {

    String id;

    String roleId;

    String userId;

}
