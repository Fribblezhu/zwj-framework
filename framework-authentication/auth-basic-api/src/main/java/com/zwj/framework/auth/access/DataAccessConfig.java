package com.zwj.framework.auth.access;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:52 AM
 * @description:
 */
public interface DataAccessConfig {

    /**
     * 数据操作方式
     * @return
             */
    String getAction();

    /**
     * 数据控制方式
     * @return
     */
    String getType();


    /**
     * 内置数据操作方式类型
     */
    interface DefaultType {
        // 自己创建的数据
        String OWN_CREATED = "OWN_CREATED";
        // 根据字段过滤
        String DENY_FIELDS = "DENY_FIELDS";
        // 字段范围
        String FIELD_SCOPE = "FIELD_SCOPE";
        // 脚本控制
        String SCRIPT = "SCRIPT";
        // 自定义控制
        String CUSTOM = "CUSTOM";
    }


}
