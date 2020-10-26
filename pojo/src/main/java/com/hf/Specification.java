package com.hf;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2020/4/24.
 * 规格实体类
 */

public class Specification implements Serializable{
    private Long id;

    private String specName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "id=" + id +
                ", specName='" + specName + '\'' +
                '}';
    }
}