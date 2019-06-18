package com.zwj.system.authorication.user.repository;

import com.zwj.system.authorication.user.entity.UserSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 2:17 PM
 * @description:
 */
public interface UserSessionRepository extends JpaRepository<UserSessionEntity, String> {
}
