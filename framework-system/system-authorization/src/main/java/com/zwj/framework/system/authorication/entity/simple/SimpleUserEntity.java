package com.zwj.framework.system.authorication.entity.simple;


import com.zwj.framework.common.entity.simple.SimpleGenericRecordEntity;
import com.zwj.framework.system.authorication.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:20 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class SimpleUserEntity extends SimpleGenericRecordEntity<String> implements UserEntity {

    private String username;

    private String name;

    private String password;

    private String salt;

    private byte status;

}
