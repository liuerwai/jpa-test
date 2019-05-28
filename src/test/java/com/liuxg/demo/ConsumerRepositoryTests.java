package com.liuxg.demo;

import com.liuxg.demo.app.JpaTestApplication;
import com.liuxg.demo.repository.ConsumerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = JpaTestApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerRepositoryTests {

    @Autowired
    ConsumerRepository repository;

    @Test
    public void contextLoads() {

        repository.findAll();
    }

}
