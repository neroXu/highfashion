package com.hf.service;

import com.hf.Brand;
import com.hf.Specification;
import com.hf.SpecificationCombination;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
public interface SpecificationService {
    List<Specification> findAll();

    SpecificationCombination findById(Long id);

    void insert(SpecificationCombination specificationCombination);

    void update(SpecificationCombination specificationCombination);

    void delete(Long id);
}
