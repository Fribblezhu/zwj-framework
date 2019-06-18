package com.zwj.framework.common.service;

import com.zwj.framework.common.entity.GenericEntity;
import com.zwj.framework.common.model.Model;

/**
 * @author: zwj
 * @Date: 6/8/19
 * @Time: 10:55 AM
 * @description:
 */
public interface CURDService<PK, T extends GenericEntity<PK>, M extends Model>
                    extends CreateService<PK, T, M>, UpdateService<PK, T ,M >, QueryService<PK, T, M>, DeleteService<PK, T, M>
{


}
