package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:37 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class GenericRecordStringIdEntity extends GenericStringIdEntity implements RecordModifierEntity, RecordCreatorEntity {

    @Column(name = "CREATOR_ID", length = 64)
    private String creatorId;

    @Column(name =  "CREATE_TIME")
    private Timestamp createTime;

    @Column(name = "MODIFIER_ID", length = 64)
    private String modifierId;

    @Column(name = "MODIFY_TIME")
    private Timestamp modifyTime;

}
