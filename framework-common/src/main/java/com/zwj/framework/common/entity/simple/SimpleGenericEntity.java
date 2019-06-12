package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.GenericEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:45 AM
 * @description:
 */
@Getter
@Setter
public class SimpleGenericEntity<PK> implements GenericEntity<PK> {

    private PK id;

}
