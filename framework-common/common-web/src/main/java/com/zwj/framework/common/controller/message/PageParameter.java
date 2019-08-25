package com.zwj.framework.common.controller.message;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


/**
 * @author: zwj
 * @Date: 8/9/19
 * @Time: 11:41 AM
 * @description:
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PageParameter {

    @JSONField(name = "pageIndex")
    private int pageIndex;

    @JSONField(name = "pageSize")
    private int pageSize;

    @JSONField(name = "direction")
    private Sort.Direction direction;

    @JSONField(name = "properties")
    private String[] properties;

    public Pageable buildPageable() {
        if(properties != null && properties.length >0) {
            direction = direction==null ? Sort.Direction.DESC:direction;
            return PageRequest.of(pageIndex -1, pageSize, direction, properties);
        } else {
            return PageRequest.of(pageIndex - 1, pageSize);
        }
    }

}
