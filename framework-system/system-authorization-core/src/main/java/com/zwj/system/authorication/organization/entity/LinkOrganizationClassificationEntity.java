package com.zwj.system.authorication.organization.entity;

import com.zwj.framework.common.entity.simple.GenericStringIdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: zwj
 * @Date: 6/29/19
 * @Time: 1:36 PM
 * @description:
 */
@Entity
@Table(name = "t_link_organization_classification")
public class LinkOrganizationClassificationEntity extends GenericStringIdEntity implements ILinkOrganizationClassificationEntity{
}
