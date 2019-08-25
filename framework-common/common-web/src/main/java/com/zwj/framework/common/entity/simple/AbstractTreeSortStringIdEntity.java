package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.SortSupportEntity;
import com.zwj.framework.common.entity.TreeSupportEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;


/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 12:35 PM
 * @description:
 */
@Getter
@Setter
@MappedSuperclass
public  abstract class AbstractTreeSortStringIdEntity<T extends TreeSupportEntity>
        extends AbstractTreeStringIdEntity<T> implements SortSupportEntity {

    private Long sortIndex;
}
