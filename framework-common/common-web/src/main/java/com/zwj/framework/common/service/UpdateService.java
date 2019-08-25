package com.zwj.framework.common.service;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.User;
import com.zwj.framework.common.entity.Entity;
import com.zwj.framework.common.entity.GenericEntity;

import com.zwj.framework.common.model.Model;
import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 7:42 PM
 * @description:   默认更新实体service,提供
 */
public interface UpdateService<PK, T extends GenericEntity<PK>, M extends Model> extends GenericService<PK, T, M > {

    /**
     *  默认通过Model修改实体, 默认只会全覆盖model已有的属性.
     *  可修改helper中的updateEntityBuModel方法,修改更新字段.
     * @see com.zwj.framework.common.service.helper.ServiceHelper#updateEntityByModel(Model, Entity)
     * @param PK         实体主键
     * @param model      实体模型
     * @return           this.update()
     */
    default  M updateByModel(PK PK, M model) {
        T entity = this.getRepository().findById(PK).orElse(null);
        Assert.notNull(entity, "can't update null entity");
        this.getServiceHelper().updateEntityByModel(model, entity,"id");
        Assert.notNull(entity, "can't update null entity");
        return this.update(entity, null);
    }

    /**
     *
     * @param entity    实体对象
     * @param userId    当无法从认证中心获取用户时,传入的用户id.
     * @return          返回更新后的实体
     */
    default M update(@NotNull T entity, String userId) {
        Assert.notNull(entity, "can't update null entity");
        // 自动添加修改人
        entity.setModifyTime(new Timestamp(System.currentTimeMillis()));
        entity.setModifierId(Authentication.current().map(Authentication::getUser).map(User::getId).orElse(userId));
        return this.getServiceHelper().entityToModel(this.getRepository().save(entity));
    }


    default void batchUpdateByModel(Map<PK, M> requestMap) {
        List<T> entities = new ArrayList<>();
        requestMap.forEach((k,v) -> this.getRepository().findById(k).ifPresent(entities::add));
        entities.forEach(e -> this.getServiceHelper().updateEntityByModel(requestMap.get(e.getId()), e,"id"));
        this.batchUpdate(entities, null);
    }

    default List<T> batchUpdate(List<T> entities, String userId) {
        entities.forEach(e -> {
            if(e != null){
               e.setModifyTime(new Timestamp(System.currentTimeMillis()));
               e.setModifierId(Authentication.current().map(Authentication::getUser).map(User::getId).orElse(userId));
            }
        });
        return this.getRepository().saveAll(entities);
    }

}
