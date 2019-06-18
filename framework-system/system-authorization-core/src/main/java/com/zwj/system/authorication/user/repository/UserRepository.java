package com.zwj.system.authorication.user.repository;

import com.zwj.system.authorication.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 2:56 PM
 * @description:
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {


    UserEntity findOneByLoginNameAndStatus(String loginName, Integer status);

    UserEntity findOneByLoginName(String loginName);
}
