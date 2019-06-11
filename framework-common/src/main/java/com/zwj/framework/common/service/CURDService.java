package com.zwj.framework.common.service;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;

/**
 * @author: zwj
 * @Date: 6/8/19
 * @Time: 10:55 AM
 * @description:
 */
public interface CURDService<ID, T extends GenericEntity<ID>, M extends Model>
                    extends CreateService<ID, T, M>, UpdateService<ID, T ,M>, QueryService<ID, T, M>, DeleteService<ID, T, M>
{


}
