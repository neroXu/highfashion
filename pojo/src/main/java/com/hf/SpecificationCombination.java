package com.hf;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/24.
 * 规格及规格选项的组合类
 */

public class SpecificationCombination implements Serializable{
    private Specification specification;
    private List<SpecificationOption> specificationOptions;

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public List<SpecificationOption> getSpecificationOptions() {
        return specificationOptions;
    }

    public void setSpecificationOptions(List<SpecificationOption> specificationOptions) {
        this.specificationOptions = specificationOptions;
    }

    @Override
    public String toString() {
        return "SpecificationCombination{" +
                "specification=" + specification +
                ", specificationOptions=" + specificationOptions +
                '}';
    }
}
