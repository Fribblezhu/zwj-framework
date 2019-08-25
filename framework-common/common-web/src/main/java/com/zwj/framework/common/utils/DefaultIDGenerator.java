package com.zwj.framework.common.utils;

import com.zwj.framework.core.id.IDGenerator;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.AbstractUUIDGenerator;

import java.io.Serializable;

/**
 * @author: zwj
 * @Date: 8/2/19
 * @Time: 8:51 PM
 * @description:
 */
public class DefaultIDGenerator extends AbstractUUIDGenerator  {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return IDGenerator.SNOW_FLAKE_STRING.generator();
    }
}
