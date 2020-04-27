package com.hf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/24.
 * 规格及规格选项的组合类
 */
@Setter
@Getter
@ToString
public class SpecificationCombination {
    private Specification specification;
    private List<SpecificationOption> specificationOptions;
}
