package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.SortSupportEntity;
import com.zwj.framework.common.entity.TreeSupportEntity;
import lombok.Getter;
import lombok.Setter;


/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 12:35 PM
 * @description:
 */
@Getter
@Setter
public  abstract class AbstractSimpleTreeSortEntity<PK> implements SortSupportEntity, TreeSupportEntity<PK> {

    private PK id;

    private PK  parentId;

    private Long sortIndex;

    private String path;

    private int level;


    /**
     * TODO
     * why does i can't define  [List<AbstractSimpleTreeSortEntity children] here ?
     */

}
