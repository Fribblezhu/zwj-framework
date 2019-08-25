package com.zwj.framework.common.controller.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: zwj
 * @Date: 6/7/19
 * @Time: 11:12 AM
 * @description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestPageDTO<M> implements Serializable {

    @NotNull
    PageParameter pageParameter;

    M  model;

}
