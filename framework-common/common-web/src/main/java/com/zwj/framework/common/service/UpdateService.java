package com.zwj.framework.common.service;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 7:42 PM
 * @description:
 */
public interface UpdateService<PK, T extends GenericEntity<PK>, M extends Model> extends GenericService<PK, T, M > {

    default  T updateByModel(PK PK, M model) {
        T entity = this.getRepository().findById(PK).orElse(null);
        Assert.notNull(entity, "can't update null entity");
        this.copyFromModel(entity, model);
        Assert.notNull(entity, "can't update null entity");
        entity.setId(PK);
        return this.getRepository().save(entity);
    }


    default void batchUpdateByModel(Map<PK, M> requestMap) {
        requestMap.forEach(this::updateByModel);
    }
}
