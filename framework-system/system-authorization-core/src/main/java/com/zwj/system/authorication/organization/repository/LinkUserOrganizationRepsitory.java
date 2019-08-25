package com.zwj.system.authorication.organization.repository;

import com.zwj.system.authorication.organization.entity.LinkUserOrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 11:44 PM
 * @description:
 */
@Repository
public interface LinkUserOrganizationRepsitory extends JpaRepository<LinkUserOrganizationEntity, String> {
}
