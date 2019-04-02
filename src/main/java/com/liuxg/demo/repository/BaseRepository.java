package com.liuxg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author liuxg
 * @date 2019/4/2
 */
@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, String>, JpaSpecificationExecutor<T> {

}
