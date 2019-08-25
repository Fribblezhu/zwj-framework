package com.zwj.system.authorication.common;

/**
 * @author: zwj
 * @Date: 6/27/19
 * @Time: 2:09 PM
 * @description:
 */
public enum Status {

    invalid(0),
    valid(1),
    approval(2),
    unapproval(3),
    frozen(4);

    private Integer value;

    Status(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
