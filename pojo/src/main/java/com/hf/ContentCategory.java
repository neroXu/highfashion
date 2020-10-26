package com.hf;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2020/8/16.
 */

public class ContentCategory implements Serializable{
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContentCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
