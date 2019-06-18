package com.zwj.system.authorication.code.repository;

import com.zwj.system.authorication.code.entity.CodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: zwj
 * @Date: 6/14/19
 * @Time: 4:12 PM
 * @description:
 */
@Repository
public interface CodeRepository extends JpaRepository<CodeEntity, String> {
}
