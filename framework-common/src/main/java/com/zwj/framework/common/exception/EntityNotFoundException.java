package com.zwj.framework.common.exception;

/**
 * @author: zwj
 * @Date: 6/5/19
 * @Time: 6:02 PM
 * @description:
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException() {
        super("Entity doesn't exist...");
    }
}
