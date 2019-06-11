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
public interface UpdateService<ID, T extends GenericEntity<ID>, M extends Model> extends GenericService<ID, T, M> {



    default  T updateByModel(ID ID, M model) {
        T entity = this.getRepository().findById(ID).orElse(null);
        Assert.notNull(entity, "can't update null entity");
        this.copyFromModel(entity, model);
        Assert.notNull(entity, "can't update null entity");
        entity.setId(ID);
        return this.getRepository().save(entity);
    }


    default void batchUpdateByModel(Map<ID,M> requestMap) {
        requestMap.forEach(this::updateByModel);
    }
}
