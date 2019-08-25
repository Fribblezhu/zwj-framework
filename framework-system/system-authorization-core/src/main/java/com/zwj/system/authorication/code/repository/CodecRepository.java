package com.zwj.system.authorication.code.repository;

import com.zwj.system.authorication.code.entity.CodecEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 8/2/19
 * @Time: 1:45 PM
 * @description:
 */
@Repository
public interface CodecRepository extends JpaRepository<CodecEntity, String> {
}
