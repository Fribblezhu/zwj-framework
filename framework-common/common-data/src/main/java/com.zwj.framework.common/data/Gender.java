package com.zwj.framework.common.data;

/**
 * @author: zwj
 * @Date: 8/15/19
 * @Time: 8:12 PM
 * @description:   性别
 */
public enum  Gender {
    MALE("1"), FEMALE("0");

    private String key;

    Gender(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return String.valueOf(this.key);
    }

    public String value() {
        return this.key;
    }

}
