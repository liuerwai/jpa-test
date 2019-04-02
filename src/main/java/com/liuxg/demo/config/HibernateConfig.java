package com.liuxg.demo.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liuxg
 * @date 2019/4/2
 */

@Configuration
@EnableJpaRepositories("com.liuxg")
@EntityScan("com.liuxg")
@EnableTransactionManagement
@SpringBootApplication
public class HibernateConfig {

}
