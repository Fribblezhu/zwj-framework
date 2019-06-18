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
public  abstract class AbstractTreeSortStringIdEntity extends GenericStringIdEntity implements SortSupportEntity, TreeSupportEntity<String> {


    private String  parentId;

    private Long sortIndex;

    private String path;

    private int level;


    /**
     * TODO
     * why does i can't define  [List<AbstractTreeSortStringIdEntity children] here ?
     */

}
