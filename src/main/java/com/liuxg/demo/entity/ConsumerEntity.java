package com.liuxg.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author liuxg
 * @date 2019/4/1
 */
@Entity
@Table(name = "consumer")
public class ConsumerEntity {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
