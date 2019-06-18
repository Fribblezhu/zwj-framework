package com.zwj.system.authorication.role.repository;

import com.zwj.system.authorication.role.entity.LinkRoleCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 2:38 PM
 * @description:
 */
@Repository
public interface LinkRoleCodeRepository  extends JpaRepository<LinkRoleCodeEntity, String> {
}
