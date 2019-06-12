package com.zwj.framework.common.entity;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 11:01 AM
 * @description:
 */
public interface SortSupportEntity extends Comparable<SortSupportEntity>, Entity {

    Long getSortIndex();

    void setSortIndex(Long sortIndex);

    @Override
    default int compareTo(SortSupportEntity o) {
        if(o == null)
            return -1;
        return Long.compare(getSortIndex() == null ? 0: getSortIndex() , o.getSortIndex()== null ? 0 : o.getSortIndex());
    }
}
