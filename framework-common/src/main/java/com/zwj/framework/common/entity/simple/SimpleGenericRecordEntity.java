package com.zwj.framework.common.entity.simple;

import com.zwj.framework.common.entity.RecordCreatorEntity;
import com.zwj.framework.common.entity.RecordModifierEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/12/19
 * @Time: 9:37 AM
 * @description:
 */
@Getter
@Setter
public class SimpleGenericRecordEntity<PK> extends SimpleGenericEntity<PK> implements RecordModifierEntity, RecordCreatorEntity {

    private String creatorId;

    private Date createTime;

    private String modifierId;

    private Date modifyTime;

}
