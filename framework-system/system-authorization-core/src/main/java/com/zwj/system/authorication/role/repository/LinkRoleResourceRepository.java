package com.zwj.system.authorication.role.repository;

import com.zwj.system.authorication.role.entity.LinkRoleResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 3:02 PM
 * @description:
 */
@Repository
public interface LinkRoleResourceRepository extends JpaRepository<LinkRoleResourceEntity, String > {



}
