package com.zwj.system.authorication.tenant.repository;

import com.zwj.system.authorication.tenant.entity.TenantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 3:15 PM
 * @description:
 */
public interface TenantRepository extends JpaRepository<TenantEntity, String> {
}
