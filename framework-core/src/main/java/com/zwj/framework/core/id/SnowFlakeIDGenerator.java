package com.zwj.framework.core.id;

import com.zwj.framework.utils.RandomUtils;
import lombok.extern.slf4j.Slf4j;


/**
 * @author: zwj
 * @Date: 6/4/19
 * @Time: 10:17 AM
 * @description:  twitter's snow flake id generator,which aways used in distributed system .it works more than
 *     260 thousands times a second.
 */
@Slf4j
public class SnowFlakeIDGenerator {

    // 起始时间 2015/01/01
    private static final long START_STAMP = 1480166465631L;

    // 标识符长度, 时间戳,机器标识,数据中心标识
    private static final long SEQUENCE_BIT = 12;
    private static final long MACHINE_BIT = 5;
    private static final long DATACENTER_BIT = 5;

    // 每一部分的做大数值
    private static final long MAX_SEQUENCE_NUM = -1L ^ (-1L << SEQUENCE_BIT);
    private static final long MAX_MACHINE_NUM = -1L ^ (-1L << MACHINE_BIT);
    private static final long MAX_DATACENTER_NUM = -1L ^ (-1L << DATACENTER_BIT);

    // 每一部分值向左位移
    private static final long MACHINE_LEFT =  SEQUENCE_BIT;
    private static final long DATACENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;
    private static final long TIMESTMP_LEFT = DATACENTER_LEFT + DATACENTER_BIT;

    // 各部分的值
    private long machineId;
    private long datacenterId;
    private long sequence = 0L;
    private long lastTimestamp = -1L;
    
    // 单例
    public static SnowFlakeIDGenerator generator;
    static  {
        generator = new SnowFlakeIDGenerator();
    }
    private SnowFlakeIDGenerator() {
        this.initGenerator();
    }

    private void  initGenerator() {
        long machineIdTemp = this.getMachineId();
        long datacenterIdTemp = this.getDatacenterId();
        if(machineIdTemp > MAX_MACHINE_NUM || machineIdTemp < 0) {
            throw new IllegalArgumentException(String.format("snow flake generator init error: the machine id can't greater" +
                    " than %d or less than 0", MAX_MACHINE_NUM));
        }
        if(datacenterIdTemp > MAX_DATACENTER_NUM || datacenterIdTemp < 0)  {
            throw new IllegalArgumentException(String.format("snow flake generator init error: the datacenter id can't greater" +
                    "then %d or less than 0", MAX_DATACENTER_NUM));
        }
        this.datacenterId = datacenterIdTemp;
        this.machineId = machineIdTemp;
    }


    protected long getDatacenterId() {
        return  Long.getLong("datacenter_id", RandomUtils.getRandom().nextInt(31));
    }

    protected  long getMachineId() {
        return Long.getLong("machine_id", RandomUtils.getRandom().nextInt(31));
    }

    /**
     *
     * @return  返回下一个ID
     */

    public synchronized long nextId() {
        long currTimestamp = getNewTimestamp();
        if(currTimestamp < lastTimestamp) {
            log.error("clock moved backwards, refusing to generate ID");
            throw new UnsupportedOperationException("clock moved backwards, refusing to generate ID");
        }
        if(currTimestamp == lastTimestamp) {
            sequence = (sequence + 1) & MAX_SEQUENCE_NUM;
            if(sequence == 0L) {
                currTimestamp = getNextMill();
            }
        }else {
            sequence = 0L;
        }
        lastTimestamp = currTimestamp;
        return  (currTimestamp - START_STAMP) << TIMESTMP_LEFT
                | datacenterId << DATACENTER_LEFT
                | machineId << MACHINE_LEFT
                | sequence;
    }

    private long  getNextMill() {
        long mill = getNewTimestamp();
        while(mill < lastTimestamp) {
            mill = getNewTimestamp();
        }
        return mill;
    }

    private static long getNewTimestamp () {
        return System.currentTimeMillis();
    }




}
