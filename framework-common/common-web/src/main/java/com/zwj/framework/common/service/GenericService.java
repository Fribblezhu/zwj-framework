package com.zwj.framework.common.service;

import com.zwj.framework.auth.Authentication;
import com.zwj.framework.auth.User;
import com.zwj.framework.common.entity.GenericEntity;


import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.service.helper.ServiceHelper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.Assert;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 1:08 PM
 * @description:
 */
public interface GenericService<PK, E extends GenericEntity<PK>, M extends Model > {

    ServiceHelper<E, M> getServiceHelper();

    JpaRepository<E, PK> getRepository();

    default void updateRecord(E  entity, String userId) {
        Assert.notNull(entity, "can't update empty entity Record...");
        // 自动添加创建人
        entity.setCreateTime(new Timestamp(System.currentTimeMillis()));
        entity.setCreatorId(getCurrentUser().map(User::getId).orElse(userId));
        // 自动添加修改人
        entity.setModifyTime(new Timestamp(System.currentTimeMillis()));
        entity.setModifierId(getCurrentUser().map(User::getId).orElse(userId));
    }

    default Optional<User> getCurrentUser() {
        return Authentication.current().map(Authentication::getUser);
    }

}
