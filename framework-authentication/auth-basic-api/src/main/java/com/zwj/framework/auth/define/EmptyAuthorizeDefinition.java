package com.zwj.framework.auth.define;

import com.zwj.framework.auth.annotation.Logical;

import java.util.Set;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 4:06 PM
 * @description:
 */
public class EmptyAuthorizeDefinition implements AuthorizeDefinition {
    @Override
    public Phased getPhased() {
        return null;
    }

    @Override
    public DataAccessDefinition getDataAccessDefinition() {
        return null;
    }

    @Override
    public Logical getLogical() {
        return null;
    }

    @Override
    public Set<String> getPermissions() {
        return null;
    }

    @Override
    public Set<String> getRoles() {
        return null;
    }

    @Override
    public Set<String> getActions() {
        return null;
    }

    @Override
    public Set<String> getUsers() {
        return null;
    }
}
