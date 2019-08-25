package com.zwj.framework.logging.event;

import com.zwj.framework.logging.AccessLogInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/25/19
 * @Time: 3:37 PM
 * @description:
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoggingAfterEvent {

    private AccessLogInfo logInfo;

}
