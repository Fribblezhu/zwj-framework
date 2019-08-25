package com.zwj.framework.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author: zwj
 * @Date: 8/7/19
 * @Time: 4:27 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageResponseModel<M> implements Model {

    private List<M> content;

    private int number;

    private int size;

    private long totalElements;

    private int totalPages;

}
