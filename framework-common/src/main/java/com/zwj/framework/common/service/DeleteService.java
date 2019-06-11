package com.zwj.framework.common.service;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 11:26 AM
 * @description:
 */
public interface DeleteService<ID, T extends GenericEntity<ID>, M extends Model> extends GenericService<ID, T, M> {

    default void deleteByPrimaryKey(ID ID) {
        this.getRepository().deleteById(ID);
    }

    default  void deleteByPrimaryKeys(List<ID> IDS) {
        Assert.notNull(IDS, "delete by primary key list can't access null list...");
        IDS.forEach(this::deleteByPrimaryKey);
    }
}
