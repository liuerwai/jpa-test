package com.liuxg.demo.repository;

import com.liuxg.demo.entity.ConsumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liuxg
 * @date 2019/4/1
 */
@Repository
public interface ConsumerRepository extends BaseRepository<ConsumerEntity> {


}
