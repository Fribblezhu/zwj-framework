package com.zwj.system.authorication.user.service.interf;

import com.zwj.framework.common.service.CURDService;
import com.zwj.system.authorication.user.entity.UserSessionEntity;
import com.zwj.system.authorication.user.model.UserSessionModel;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 2:18 PM
 * @description:
 */
public interface IUserSessionService extends CURDService<String, UserSessionEntity, UserSessionModel> {
}
