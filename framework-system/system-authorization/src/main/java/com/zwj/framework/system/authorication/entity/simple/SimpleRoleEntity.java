package com.zwj.framework.system.authorication.entity.simple;

import com.zwj.framework.common.entity.simple.SimpleGenericRecordEntity;
import com.zwj.framework.system.authorication.entity.RoleEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:32 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class SimpleRoleEntity extends SimpleGenericRecordEntity<String> implements RoleEntity {

    private String name;

    private String description;

    private byte status;

}
