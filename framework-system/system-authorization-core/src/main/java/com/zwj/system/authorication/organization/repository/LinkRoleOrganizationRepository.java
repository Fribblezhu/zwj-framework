package com.zwj.system.authorication.organization.repository;

import com.zwj.system.authorication.organization.entity.LinkRoleOrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 11:23 AM
 * @description:
 */
@Repository
public interface LinkRoleOrganizationRepository extends JpaRepository<LinkRoleOrganizationEntity, String> {
}
