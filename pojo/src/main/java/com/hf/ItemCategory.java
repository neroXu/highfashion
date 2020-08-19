package com.hf;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ItemCategory implements Serializable{
    private Long id;

    private Long parentId;

    private String name;

    private Long typeId;


}