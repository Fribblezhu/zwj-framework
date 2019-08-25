package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.SortSupportEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

/**
 * @author: zwj
 * @Date: 7/16/19
 * @Time: 3:53 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class GenericSortStringIdEntity extends GenericStringIdEntity implements SortSupportEntity {

    private Long sortIndex;
}
