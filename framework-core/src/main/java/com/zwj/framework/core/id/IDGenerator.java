package com.zwj.framework.core.id;


import com.zwj.framework.utils.RandomUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author: zwj
 * @Date: 6/3/19
 * @Time: 10:38 PM
 * @description:
 *
 *   ID生成器
 */
@FunctionalInterface
public interface IDGenerator<T> {

    T generator();

    IDGenerator<?> NULL = () -> null;

    IDGenerator<String> UUID = () -> java.util.UUID.randomUUID().toString();

    IDGenerator<String> RANDOM = RandomUtils::randomChar;

    IDGenerator<String> MD5 = () -> {
        try {
          MessageDigest digest = MessageDigest.getInstance("MD5");
          digest.update(UUID.generator().concat(RANDOM.generator()).getBytes());
          return  new BigInteger(1, digest.digest()).toString(16);
        }catch (NoSuchAlgorithmException e) {
          throw new RuntimeException(e);
        }
    };

    IDGenerator<Long> SNOW_FLAKE = SnowFlakeIDGenerator.generator::nextId;

    IDGenerator<String> SNOW_FLAKE_STRING =  () -> String.valueOf(SNOW_FLAKE.generator());

    IDGenerator<String> SNOW_FLAKE_HEX = () -> Long.toHexString(SNOW_FLAKE.generator());


}
