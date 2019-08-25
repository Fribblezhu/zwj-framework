package com.zwj.framework.common.service;

import com.zwj.framework.common.controller.message.PageParameter;
import com.zwj.framework.common.controller.message.RequestPageDTO;
import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.model.PageResponseModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 6:44 PM
 * @description:
 */
@SuppressWarnings("unchecked")
public interface QueryService<PK, T extends GenericEntity<PK>, M extends Model> extends GenericService<PK, T, M> {


    default  M getByPrimaryKey(PK PK) {
        T entity = this.getRepository().findById(PK)
                .orElse(null);
        return entity==null?null: this.getServiceHelper().entityToModel(entity);
    }

    default List<M> getByPrimaryKeyList(List<PK> ids) {
        List<T> entities = this.getRepository().findAllById(ids);
        return this.getServiceHelper().batchEntityToModel(entities);
    }

    default List<M> queryByModel(M model) {
        T entity = this.getServiceHelper().modelToEntity(model);
        return this.getServiceHelper().batchEntityToModel(this.getRepository().findAll(Example.of(entity)));
    }

    default PageResponseModel<M> queryPageByModel(@NotNull PageParameter pageParameter, M model) {
        if(model == null) {
            return this.queryPage(pageParameter.buildPageable());
        } else {
            T entity = this.getServiceHelper().modelToEntity(model);
            Page<T> page = this.getRepository().findAll(Example.of(entity), pageParameter.buildPageable());
            return this.getServiceHelper().toPageResponseModel(page);
        }
    }

    default PageResponseModel<M> queryPage(@NotNull Pageable pageable) {
        Page<T> page = this.getRepository().findAll(pageable);
        return this.getServiceHelper().toPageResponseModel(page);
    }
}
