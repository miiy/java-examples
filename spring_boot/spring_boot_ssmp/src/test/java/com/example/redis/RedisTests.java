package com.example.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void set() {
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("hello", "hello redis");
    }

    @Test
    void get() {
        ValueOperations ops = redisTemplate.opsForValue();
        Object h = ops.get("hello");
        System.out.println(h);
    }

    @Test
    void set2() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("hello2", "hello redis2");
    }

    @Test
    void get2() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String h = ops.get("hello2");
        System.out.println(h);
    }

    //
    //127.0.0.1:6379> keys *
    //1) "hello2"
    //2) "\xac\xed\x00\x05t\x00\x05hello"

}
