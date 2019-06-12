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
public interface DeleteService<PK, T extends GenericEntity<PK>, M extends Model> extends GenericService<PK, T, M> {

    default void deleteByPrimaryKey(PK PK) {
        this.getRepository().deleteById(PK);
    }

    default  void deleteByPrimaryKeys(List<PK> PKS) {
        Assert.notNull(PKS, "delete by primary key list can't access null list...");
        PKS.forEach(this::deleteByPrimaryKey);
    }
}
