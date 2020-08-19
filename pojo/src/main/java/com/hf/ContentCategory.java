package com.hf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2020/8/16.
 */
@Setter
@Getter
@ToString
public class ContentCategory implements Serializable{
    private Long id;
    private String name;
}
