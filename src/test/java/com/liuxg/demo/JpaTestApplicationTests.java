package com.liuxg.demo;

import com.liuxg.demo.repository.ConsumerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaTestApplicationTests.class)
@ComponentScan(value = "com.liuxg")
public class JpaTestApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    ConsumerRepository consumerRepository;

    @Test
    public void test() {
        consumerRepository.findAll();
    }

}
