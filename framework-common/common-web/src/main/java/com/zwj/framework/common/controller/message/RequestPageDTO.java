package com.zwj.framework.common.controller.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class RequestPageDTO<T> {

    int pageSize;

    int pageNum;

    T  entity;

}
