package com.liuxg.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuxg
 * @date 2019/5/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataRedisTest.class)
@ComponentScan(value = "com.liuxg")
public class SpringDataRedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test(){
        redisTemplate.opsForValue().get("xxx");
    }
}
