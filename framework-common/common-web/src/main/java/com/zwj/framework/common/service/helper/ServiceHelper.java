package com.zwj.framework.common.service.helper;

import com.zwj.framework.common.entity.Entity;
import com.zwj.framework.common.model.Model;
import com.zwj.framework.common.model.PageResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zwj
 * @Date: 8/5/19
 * @Time: 8:39 PM
 * @description:   You should use  {@link Model} as request parameter and response data, so this {@link ServiceHelper}
 *      cant helper you to cast Model to Entity, or Case Entity to Model.
 */
public interface ServiceHelper<E extends Entity, M extends Model> {

    default M updateModelByEntity(E entity, M model, String... ignoreProperties) {
        BeanUtils.copyProperties(entity, model, ignoreProperties);
        return model;
    }

    default M updateModelByEntity(E entity, M model) {
        return this.updateModelByEntity(entity, model, (String) null);
    }

    default E updateEntityByModel(M model, E entity, String... ignoreProperties) {
        BeanUtils.copyProperties(model, entity, ignoreProperties);
        return entity;
    }

    default E updateEntityByModel(M model, E entity) {
        return this.updateEntityByModel(model, entity, (String) null);
    }

    default PageResponseModel<M> toPageResponseModel(Page<E> page) {
        PageResponseModel<M> model = new PageResponseModel<>();
        model.setContent(this.batchEntityToModel(page.getContent()));
        model.setNumber(page.getNumber());
        model.setSize(page.getSize());
        model.setTotalElements(page.getTotalElements());
        model.setTotalPages(page.getTotalPages());
        return model;
    }

    /**
     * @description batch cast
     * {@link this#modelToEntity(Model)}
     */
    default List<E> batchModelToEntity(@NotNull List<M> models) {
        return models.stream().map(this::modelToEntity).collect(Collectors.toList());
    }

    /**
     * @description batch case
     * {@link this#entityToModel(Entity)}
     */
    default List<M> batchEntityToModel(@NotNull List<E> entities) {
        return entities.stream().map(this::entityToModel).collect(Collectors.toList());
    }

    /**
     * @description cast {@link Model} to {@link Entity}
     * {@link com.zwj.framework.common.service.QueryService#queryByModel(Model)}
     * {@link com.zwj.framework.common.service.QueryService#queryPageByModel(Pageable, Model)}
     */
     E modelToEntity(@NotNull M model);

    /**
     * @description cast {@link Entity} to {@link Model}
     */
    M entityToModel(@NotNull E entity);

}
