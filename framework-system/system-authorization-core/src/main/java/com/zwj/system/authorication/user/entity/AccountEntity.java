package com.zwj.system.authorication.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/18/19
 * @Time: 11:44 AM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_account")
public class AccountEntity extends GenericStringIdEntity implements IAccountEntity {

    /** 账户昵称或者名字 **/
    private String name;

    /** 登录名 **/
    @Column(name = "login_name")
    private String loginName;

    /** 密码 **/
    private String password;

    /** 密码加盐 **/
    private String salt;

    /** OAuth2 **/
    private String openId;

    /** Oauth2 **/
    private String openSecret;

    /** 邮箱 **/
    private String email;

    /** 账户状态 **/
    private Integer status;

    /** 是否临时账户 **/
    @Column(name = "is_temporary")
    private Boolean isTemporary;

    /** 临时账户有效开始时间 **/
    @Column(name = "start_date")
    private Date startDate;

    /** 临时账户有效结束时间 **/
    @Column(name = "end_date")
    private Date endDate;

    /** 隔离ID **/
    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "approval_status")
    private Integer approvalStatus;

    @Column(name = "identity_id")
    private String identityId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Column(name = "begin_valid_time")
    private Date beginValidTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Column(name = "end_valid_time")
    private Date endValidTime;

    /**
     * 该账号是否由superadmin创建
     */
    @Column(name = "is_superadmin")
    private Integer isSuperadmin;

    @Column(name = "unit_id")
    private String unitId;

    /** 找回密码校验码 **/
    @Column(name = "validata_code")
    private String validataCode;

    /** 找回密码校验码过期时间 **/
    @Column(name = "validata_out_date")
    private Date validataOutDate;

    /** 最后成功登陆ip **/
    @Column(name = "last_login_ip")
    private String lastLoginIp;

    /** 最后成功登陆日期 **/
    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "modify_password_time")
    private Timestamp modifyPasswordTime;

    @Column(name = "login_time")
    private Timestamp loginTime;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private UserEntity userEntity;


}
