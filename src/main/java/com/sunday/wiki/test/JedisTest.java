package com.sunday.wiki.test;

import redis.clients.jedis.Jedis;

/**
 * 测试jedis
 *
 * @author wangfeng
 * @create 2021-12-22 15:51
 */
public class JedisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println(jedis.ping());
    }

}
