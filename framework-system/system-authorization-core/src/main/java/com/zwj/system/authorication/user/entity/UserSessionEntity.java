package com.zwj.system.authorication.user.entity;

import com.zwj.framework.common.entity.simple.GenericRecordStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author: zwj
 * @Date: 6/15/19
 * @Time: 2:10 PM
 * @description:
 */
@Getter
@Setter
@Entity
@Table(name = "t_user_session")
@NoArgsConstructor
@AllArgsConstructor
public class UserSessionEntity extends GenericRecordStringIdEntity implements IUserSessionEntity{

    @Column(name = "user_id")
    //用户ID
    private String userId;

    @Column(name = "user_name")
    //用户姓名
    private String userName;

    @Column(name = "begin_date")
    //会话开始时间
    private Date beginDate;

    @Column(name = "ip_address")
    //用户会话IP地址
    private String ipAddress;

    @Column(name = "mac_no")
    //网卡地址
    private String macNo;

    @Column(name = "token_validate_date")
    //有效时间
    private Date tokenValidateDate;

    @Column(name = "login_name")
    //用户登录名
    private String loginName;

    @Column(name = "tenant_id")
    private String tenantId;

    private Integer status;

}
