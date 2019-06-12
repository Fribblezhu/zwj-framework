package com.zwj.framework.common.service;

import com.zwj.framework.common.controller.message.RequestPageDTO;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import org.springframework.data.domain.*;

import java.util.List;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 6:44 PM
 * @description:
 */
@SuppressWarnings("unchecked")
public interface QueryService<PK, T extends GenericEntity<PK>, M extends Model> extends GenericService<PK, T, M> {

    default  T getByPrimaryKey(PK PK) {
        return this.getRepository().findById(PK).orElse(null);
    }

    default List<T> getByPrimaryKeyList(List<PK> ids) {
        return this.getRepository().findAllById(ids);
    }

    default List<T> queryByEntity(T entity) {
        return this.getRepository().findAll(Example.of(entity));
    }


    default Page<T> queryPageByEntity(RequestPageDTO<T> requestPageDTO) {
        T entity = requestPageDTO.getEntity();
        Pageable pageable = PageRequest.of(requestPageDTO.getPageNum(), requestPageDTO.getPageSize());
        return this.getRepository().findAll(Example.of(entity), pageable);
    }
}
