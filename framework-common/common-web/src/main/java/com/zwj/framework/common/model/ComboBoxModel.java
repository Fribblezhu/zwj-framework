package com.zwj.framework.common.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 8/7/19
 * @Time: 3:12 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComboBoxModel implements Model {

    private String value;

    private String label;

    private boolean disabled;

}
