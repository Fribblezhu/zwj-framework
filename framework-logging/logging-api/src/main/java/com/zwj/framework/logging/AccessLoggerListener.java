package com.zwj.framework.logging;



/**
 * @author: zwj
 * @Date: 6/26/19
 * @Time: 10:25 AM
 * @description:  访问日志监听器,实现此接口并注入到spring中即可收到日志消息.
 */
public interface AccessLoggerListener {

    void  onLogger(AccessLogInfo logInfo);

    default void onLoggerBefore(AccessLogInfo logInfo) {
    }

}
