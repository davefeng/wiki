package com.sunday.wiki.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * redis工具类
 *
 * @author wangfeng
 * @create 2021-12-22 18:37
 */
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * Description 普通缓存放入
     * @param key 键
     * @param value 值
     * @return boolean
     * @throws Exception
     * @Author wangfeng
     * @Date 2021-12-22 18:47:25
     */
    public boolean set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Description 普通缓存获取
     * @param key 键
     * @return java.lang.Object
     * @throws Exception
     * @Author wangfeng
     * @Date 2021-12-22 18:50:46
     */
    public Object get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

}
