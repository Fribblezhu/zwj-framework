package com.zwj.system.authorication.resource.model;

import com.zwj.framework.common.model.Model;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 3:46 PM
 * @description:
 */
@Getter
@Setter
public class ResourcePoolModel implements Model {

    private String id;

    private String comments;

    private String tenantId;

    private Integer status;

    private String name;

}
