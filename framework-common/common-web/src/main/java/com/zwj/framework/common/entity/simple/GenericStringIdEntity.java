package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.GenericEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

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
public class GenericStringIdEntity implements GenericEntity<String>, Serializable {

    @Id                                   // 注意此处不能使用 org.springframework.data.annotation.Id
    @Column(name = "id", length = 64)
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "com.zwj.framework.common.utils.DefaultIDGenerator")
    private String id;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "creator_id")
    private String creatorId;

    @Column(name = "modify_time")
    private Timestamp modifyTime;

    @Column(name = "modifier_id")
    private String modifierId;

}
