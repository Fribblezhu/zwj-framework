package com.zwj.system.authorication.resource.repository;

import com.zwj.system.authorication.resource.entity.ResourceEntity;
import com.zwj.system.authorication.resource.entity.ResourcePoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 5:19 PM
 * @description:
 */
@Repository
public interface ResourceRepository  extends JpaRepository<ResourceEntity, String> {

    List<ResourceEntity> findAllByResourcePool(ResourcePoolEntity resourcePoolEntity);

}
