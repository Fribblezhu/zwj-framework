package com.zwj.framework.auth.web;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 4:44 PM
 * @description:
 */
public interface UserTokenParser {
    ParsedToken parser(HttpServletRequest request);
}
