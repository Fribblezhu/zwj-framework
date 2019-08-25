package com.zwj.system.authorication.tenant.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zwj.framework.common.entity.simple.GenericStringIdEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: zwj
 * @Date: 6/21/19
 * @Time: 2:54 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_tenant")
public class TenantEntity extends GenericStringIdEntity implements ITenantEntity {


    /** 名字 **/
    private String name;

    /** 租户编码 **/
    private String code;

    /** 租户简称 **/
    private String abbreviation;

    /** 默认最大权限 **/
    private Integer maxLimit;

    /** 联系人 **/
    private String contactPerson;

    /** 地址 **/
    private String address;

    /** 联系电话 **/
    private String contactPhone;

    /** 邮箱 **/
    private String email;

    /** 生效时间 **/
    @Column(name = "effective_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date effectiveTime;

    /** 失效时间 **/
    @Column(name = "expiration_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date expirationTime;

    /** 最大用户数量 **/
    private Integer maxUserNumber;

    /** 个性化域名 **/
    private String domainName;

    /** logo图片url **/
    private String logoUrl;

    /** 背景图片URL **/
    private String backgroudUrl;

    /** 显示名称 **/
    private String showName;

    /** 状态 **/
    private Integer status;

    /** 备注 **/
    private String comments;

    /** 排序号 **/
    private Long showOrder;

    private String uniqueId;

}
