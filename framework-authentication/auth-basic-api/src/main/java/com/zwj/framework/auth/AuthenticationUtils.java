package com.zwj.framework.auth;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 11:15 AM
 * @description:
 */
public class AuthenticationUtils {

    public static AuthenticationPredicate createPredicate(String expression) {
        if(null == expression)
            return authentication -> false;
        AuthenticationPredicate main = null;
        AuthenticationPredicate temp = null;
        boolean lastAnd = true;
        for(String item: expression.split("[ ]")) {
            if(item.startsWith("permission:")) {
                String[] permissionsAndActions = item.split("[:]", 2);
                if(permissionsAndActions.length < 2) {
                    temp = authentication -> !authentication.getPermissions().isEmpty();
                } else {
                    // todo
                }
            }else if (item.startsWith("role:")) {

            }
            if (null == main)
                main = temp;
        }
        return main == null ? a -> false : (lastAnd? main.and(temp) : main.or(temp));
    }

}
