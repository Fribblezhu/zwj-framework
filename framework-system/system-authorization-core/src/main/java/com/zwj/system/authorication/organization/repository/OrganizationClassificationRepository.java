package com.zwj.system.authorication.organization.repository;

import com.zwj.system.authorication.organization.entity.OrganizationClassificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 10:04 PM
 * @description:
 */
@Repository
public interface OrganizationClassificationRepository extends JpaRepository<OrganizationClassificationEntity, String> {


    OrganizationClassificationEntity findOneByParentIdAndCode(String parentId, String code);
}
