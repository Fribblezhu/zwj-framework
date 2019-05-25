package com.zwj.framework.auth;

import com.zwj.framework.common.utils.ThreadLocalUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

/**
 * @author: zwj
 * @Date: 5/15/19
 * @Time: 10:58 AM
 * @description:
 */
public class AuthenticationHolder {

    private static List<AuthenticationSupplier> suppliers = new ArrayList<>();

    private static String CURRENT_USER_ID_KEY = Authentication.class.getName() + "_current_id";

    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    private static Authentication get(Function<AuthenticationSupplier, Authentication> function) {
        lock.readLock().lock();
        try {
            return suppliers.stream().map(function).filter(Objects::nonNull).findFirst().orElse(null);
        }finally {
            lock.readLock().unlock();
        }
    }

    public static Authentication get() {
        String currentId = ThreadLocalUtils.get(CURRENT_USER_ID_KEY);
        if(currentId != null) {
            return get(currentId);
        }
        return get(AuthenticationSupplier::get);
    }

    public static Authentication get(String userId) {
        return get(supplier->supplier.get(userId));
    }

    public static void  addSupplier(AuthenticationSupplier supplier) {
        lock.writeLock().lock();
        try{
            suppliers.add(supplier);
        }finally {
            lock.writeLock().unlock();
        }
    }

}
