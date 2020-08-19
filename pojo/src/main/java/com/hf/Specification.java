package com.hf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/24.
 * 规格实体类
 */

@Setter
@Getter
@ToString
public class Specification implements Serializable{
    private Long id;

    private String specName;

}