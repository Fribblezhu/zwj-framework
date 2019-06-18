package com.zwj.framework.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author: zwj
 * @Date: 5/25/19
 * @Time: 2:29 PM
 * @description:
 */
@SuppressWarnings("unchecked")
public final class ThreadLocalUtils {

    private ThreadLocalUtils() {}

    private static  ThreadLocal<Map<String, Object>> local = ThreadLocal.withInitial(HashMap::new);

    public static Map<String,Object> getAll() {
        return  local.get();
    }

    public static <T> T get(String key) {
        return (T)local.get().get(key);
    }

    public static <T> T push(String key, T value) {
        return (T)local.get().put(key, value);
    }

    public static <T> T remove(String key) {
        return (T)local.get().remove(key);
    }

    public static void clear () {
        local.remove();
    }

    public static <T> T get(String key, Supplier<T> supplier) {
        return (T)local.get().computeIfAbsent(key, value -> supplier.get());
    }

    public static <T> T getAndRemove(String key) {
        try {
            return get(key);
        }finally {
            remove(key);
        }
    }


}
