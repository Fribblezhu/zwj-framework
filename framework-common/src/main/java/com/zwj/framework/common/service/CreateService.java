package com.zwj.framework.common.service;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.User;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;
import com.zwj.framework.common.model.Model;
import org.springframework.util.Assert;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 1:37 PM
 * @description:
 */
public interface CreateService<PK, T extends GenericEntity<PK>, M extends Model > extends GenericService<PK, T,M>  {


    default T create(M model) {
        T entity = this.createDefaultEntity();
        this.copyFromModel(entity, model);
        Assert.notNull(entity, "can't create null entity ...");
        // 自动添加创建人
        if(entity instanceof RecordCreatorEntity) {
            ((RecordCreatorEntity) entity).setCreateTIme(new Date());
            ((RecordCreatorEntity) entity).setCreatorId(Authentication.current().map(Authentication::getUser).map(User::getId).orElse(null));
        }
        // 自动添加修改人
        if(entity instanceof RecordModifierEntity) {
            ((RecordModifierEntity) entity).setModifyTime(new Date());
            ((RecordModifierEntity) entity).setModifierId(Authentication.current().map(Authentication::getUser).map(User::getId).orElse(null));
        }
        return this.getRepository().save(entity);
    }

}
