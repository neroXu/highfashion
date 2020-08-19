package com.hf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Brand implements Serializable{
    private Long id;

    private String name;

    private String firstChar;

}