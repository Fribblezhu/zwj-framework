package com.zwj.system.authorication.organization.repository;

import com.zwj.system.authorication.organization.entity.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 3:27 PM
 * @description:
 */
@Repository
public interface OrganizationRepository extends JpaRepository<OrganizationEntity, String> {
}
