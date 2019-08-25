package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.TreeSupportEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: zwj
 * @Date: 7/12/19
 * @Time: 5:05 PM
 * @description:   树型实体,不建议在一张表只有一颗树的情况下使用,否则会加载出整张表,除非数据量小.
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractTreeStringIdEntity<T extends TreeSupportEntity> extends GenericStringIdEntity implements TreeSupportEntity<T> {

    @Column(name = "path")
    private String path;

    @Column(name = "level", length = 6)
    private Integer level;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Set<T> children =new HashSet<>(0);
}
