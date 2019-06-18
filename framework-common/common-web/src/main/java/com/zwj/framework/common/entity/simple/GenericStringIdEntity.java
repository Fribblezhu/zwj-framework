package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.GenericEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:45 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass   // 使子类继承自身的字段
public class GenericStringIdEntity implements GenericEntity<String>,Serializable {

    @Id                                   // 注意此处不能使用 org.springframework.data.annotation.Id
    @Column(name = "ID", length = 64)
    private String id;

}
