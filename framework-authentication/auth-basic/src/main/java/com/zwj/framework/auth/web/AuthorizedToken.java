package com.zwj.framework.auth.web;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 5:51 PM
 * @description:
 */
public interface AuthorizedToken extends ParsedToken{

    String getUserId();


    default  long getMaxInactiveInternal(){return  -1;}

}
