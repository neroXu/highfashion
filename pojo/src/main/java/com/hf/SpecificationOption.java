package com.hf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Machenike-Pc on 2020/4/24.
 * 规格选项类
 */
@Setter
@Getter
@ToString
public class SpecificationOption {
    private Long id;

    private String optionName;

    private Long specId;

    private Integer orders;
}
