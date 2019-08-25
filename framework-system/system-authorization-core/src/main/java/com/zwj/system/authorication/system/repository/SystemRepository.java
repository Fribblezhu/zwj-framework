package com.zwj.system.authorication.system.repository;

import com.zwj.system.authorication.system.entity.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 7/11/19
 * @Time: 7:53 PM
 * @description:
 */
@Repository
public interface SystemRepository extends JpaRepository<SystemEntity, String> {
}
