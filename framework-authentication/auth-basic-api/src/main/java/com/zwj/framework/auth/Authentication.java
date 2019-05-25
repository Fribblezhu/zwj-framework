package com.zwj.framework.auth;

import java.util.List;
import java.util.Optional;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:51 AM
 * @description:
 */
public interface Authentication {

    User getUser();

    List<Role> getRoles();

    List<Permission> getPermissions();

    default Optional<Role> getRole(String id) {
        return null == id?Optional.empty() :
                this.getRoles().stream().filter(role -> id.equals(role.getId()) ).findAny();
    }

    default Optional<Permission> getPermission(String id) {
        return null == id?Optional.empty() :
                this.getPermissions().stream().filter(permission ->id.equals(permission.getId())).findAny();
    }

    static Optional<Authentication> current() {
        return Optional.ofNullable(AuthenticationHolder.get());
    }

}
