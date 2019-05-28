package com.liuxg.demo;

import com.liuxg.demo.config.HibernateConfig;
import com.liuxg.demo.repository.ConsumerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = HibernateConfig.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTestApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    ConsumerRepository consumerRepository;

    @Test
    public void contextLoads() {
        consumerRepository.findAll();
        redisTemplate.opsForValue().get("xx");
    }

}
