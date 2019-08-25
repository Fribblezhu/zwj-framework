package com.zwj.system.authorication.resource.repository;

import com.zwj.system.authorication.resource.entity.ResourcePoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 3:47 PM
 * @description:
 */
@Repository
public interface ResourcePoolRepository extends JpaRepository<ResourcePoolEntity,String> {
}
