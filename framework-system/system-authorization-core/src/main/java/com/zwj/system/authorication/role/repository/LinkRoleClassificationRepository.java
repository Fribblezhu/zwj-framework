package com.zwj.system.authorication.role.repository;

import com.zwj.system.authorication.role.entity.LinkRoleClassificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 1:56 PM
 * @description:
 */
@Repository
public interface LinkRoleClassificationRepository extends JpaRepository<LinkRoleClassificationEntity, String> {
}
