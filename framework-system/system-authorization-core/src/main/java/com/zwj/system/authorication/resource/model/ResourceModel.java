package com.zwj.system.authorication.resource.model;

import com.zwj.framework.common.model.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 5:17 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel
public class ResourceModel implements Model {

    @ApiModelProperty
    private String id;

    private String name;

    private String contents;

    private String imageUrl;

    private String code;

    private String url;

}
