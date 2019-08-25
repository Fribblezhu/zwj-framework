package com.zwj.system.authorication.code.entity;

import com.zwj.framework.common.entity.simple.GenericSortStringIdEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @author: zwj
 * @Date: 8/1/19
 * @Time: 7:31 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "t_codec")
@Entity
public class CodecEntity extends GenericSortStringIdEntity implements ICodecEntity {

    private String name;

    @Column(name = "code")
    private String code;

    @Column(name ="system_id", length = 64)
    private String systemId;

    @Column(name = "description", length = 1024)
    private String description;

    @ManyToMany(mappedBy = "codecList")
    private Set<CodeEntity> codeList;

}
