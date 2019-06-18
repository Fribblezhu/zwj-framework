package com.zwj.framework.common.service;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 1:08 PM
 * @description:
 */
public interface GenericService<PK, T extends GenericEntity<PK>, M extends Model > {

    JpaRepository<T, PK> getRepository();

    default T copyFromModel(T entity, M model) {
        throw new UnsupportedOperationException("model to entity function doesn't implements...");
    }

    default T createDefaultEntity() {
        throw  new UnsupportedOperationException("create default entity function doesn't implements....");
    }
}
