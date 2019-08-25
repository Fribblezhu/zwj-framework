package com.zwj.system.authorication.organization.model;

import com.zwj.framework.common.model.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zwj
 * @Date: 6/20/19
 * @Time: 3:30 PM
 * @description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationModel implements Model {

    private String parentId;

    private String name;

    private String nameFirstSpell;

    private String code;

    private String abbreviation;

    private String organizationLevel;

    private Integer isVirtual;

    private Integer status;

    private Integer approvalStatus;

    private String comments;

    private String tenantId;

    private Long showOrder;

    private Integer independent;

    private Integer maxLimit;

    private String orgSystemCode;

    private String bindParentOrg;

}
