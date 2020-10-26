package com.hf;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2020/4/24.
 * 规格选项类
 */
public class SpecificationOption implements Serializable{
    private Long id;

    private String optionName;

    private Long specId;

    private Integer orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "SpecificationOption{" +
                "id=" + id +
                ", optionName='" + optionName + '\'' +
                ", specId=" + specId +
                ", orders=" + orders +
                '}';
    }
}
