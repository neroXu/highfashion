package com.hf;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemCategory {
    private Long id;

    private Long parentId;

    private String name;

    private Long typeId;


}