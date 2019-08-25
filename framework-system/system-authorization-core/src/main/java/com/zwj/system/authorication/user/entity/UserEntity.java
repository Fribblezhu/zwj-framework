package com.zwj.system.authorication.user.entity;

import com.zwj.framework.common.data.Gender;
import com.zwj.framework.common.entity.simple.GenericSortStringIdEntity;
import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/13/19
 * @Time: 11:26 AM
 * @description:  user basic information table, what's more ,it has ten extends filed to save more information.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_user")
public class UserEntity extends GenericSortStringIdEntity implements IUserEntity{
    private static final long serialVersionUID = 1L;

    /** 名字 **/
    @Column(name = "username")
    private String username;

    /** 登录名 **/
    @Column(name = "login_name")
    private String loginName;

    /** 年龄 **/
    private Integer age;

    /** 地址 **/
    private String address;

    /** 性别 **/
    @Enumerated(EnumType.STRING)
    private Gender gender;

    /** 邮箱 **/
    private String email;

    /**  电话  **/
    private String phone;

    /** 简称 **/
    private String abbreviation;

    /** 出生年月 **/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_day")
    private Date birthDay;

    /** 传真 **/
    private String fax;

    /** 手机 **/
    private String mobile;

    /** 电话 **/
    private String telephone;

    /** 头像图片url **/
    private String picUrl;

    /** 说明注释 **/
    private String comments;

    /** 隔离ID **/
    private String tenantId;

    /** 审批状态 **/
    private Integer approvalStatus;

    /** 数据状态 0有效，1无效 **/
    private Integer status;

    private String modifyUser;

    @Column(name = "identity_id")
    private String identityId;

    @Column(name = "begin_valid_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginValidTime;

    @Column(name = "end_valid_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endValidTime;

    @Column(name = "is_superadmin")
    private Integer isSuperadmin;

    // 单位Id
    @Column(name = "unit_id")
    private String unitId;

    @Column(name = "bind_address_type")
    private Integer bindAddressType;

    @Column(name = "bind_ip_address")
    private String bindIpAddress;

    @Column(name = "bind_mac_address")
    private String bindMacAddress;

    @Transient
    private String organizeId;

    /** 添加扩展字段 **/
    private String flag1;

    private String flag2;

    private String flag3;

    private String flag4;

    private String flag5;

    private String flag6;

    private String flag7;

    private String flag8;

    private String flag9;

    private String flag10;

    @Transient
    private String genderCol;

    @Transient
    private String bingGradeControl;
}
