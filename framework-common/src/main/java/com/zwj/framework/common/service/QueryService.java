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
public interface QueryService<ID, T extends GenericEntity<ID>, M extends Model> extends GenericService<ID, T, M> {

    default  T getByPrimaryKey(ID ID) {
        return this.getRepository().findById(ID).orElse(null);
    }

    default List<T> getByPrimaryKeyList(List<ID> ids) {
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
