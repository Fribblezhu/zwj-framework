package com.zwj.system.authorication.user.model;

import com.zwj.framework.common.model.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 9:40 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
public class UserModel implements Model {

    private String id;

    private String username;

    private String loginName;

    private String status;

    private String gender;

    private String mobile;

    private String telephone;

    private String picUrl;

    private Integer age;

    private String email;

    private Date birthDay;

    private Date  beginValidTime;

    private Date endValidTime;

    private String abbreviation;
}
