package com.zwj.framework.auth;

import java.util.Set;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:58 AM
 * @description:
 */
public interface Permission {

    String ACTION_GET = "GET";
    String ACTION_QUERY = "QUERY";
    String ACTION_UPDATE = "UPDATE";
    String ACTION_DELETE = "DELETE";
    String ACTION_ADD = "ADD";
    String ACTION_IMPORT = "IMPORT";
    String ACTION_EXPORT = "EXPORT";
    String ACTION_DISABLE = "DISABLE";
    String ACTION_ENABLE = "ENABLE";



    String getId();

    Set<String> getActions();
}
