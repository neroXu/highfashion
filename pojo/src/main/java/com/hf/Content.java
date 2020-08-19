package com.hf;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2020/8/16.
 */
@Setter
@Getter
public class Content implements Serializable{
    private Long id;
    private Long categoryId;
    private String title;
    private String url;
    private String pic;
    private String status;
    private Integer sortOrder;
}
