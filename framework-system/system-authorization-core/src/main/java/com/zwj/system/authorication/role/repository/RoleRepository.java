package com.zwj.system.authorication.role.repository;

import com.zwj.system.authorication.role.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 9:36 PM
 * @description:
 */
@Repository
public interface RoleRepository  extends JpaRepository<RoleEntity, String> {
}
