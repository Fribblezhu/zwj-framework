package com.zwj.framework.common.service;


import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;

import org.springframework.lang.Nullable;
import org.springframework.util.Assert;


/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 1:37 PM
 * @description:
 */
public interface CreateService<PK, T extends GenericEntity<PK>, M extends Model> extends GenericService<PK, T, M>  {

    /**
     *  通过模型创建实体
     * @param model   实体类对应的模型
     * @param userId 当找不到当前用户时使用的操作者id
     * @return   创建好的对象
     * @see CreateService#insert(GenericEntity, String)
     */
    default T create(M model, @Nullable String userId) {
        T entity = this.getServiceHelper().modelToEntity(model);
        Assert.notNull(entity, "can't create null entity ...");
        this.updateRecord(entity, userId);
        Assert.notNull(entity.getId(), "新增实体前，必须赋予其主键ID.");
        return this.getRepository().save(entity);
    }

    /**
     *   插入实体
     * @param entity   实体对象
     * @param userId    当找不到当前用户时使用的操作者id
     * @return  返回创建好的对象
     * @see org.springframework.data.jpa.repository.JpaRepository#save(Object)
     */
    default T insert(T entity, @Nullable String userId) {
        Assert.notNull(entity, "can't insert null entity ...");
        this.updateRecord(entity, userId);
        return this.getRepository().save(entity);
    }

}
