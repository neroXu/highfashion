package com.hf.service;

import com.hf.Specification;
import com.hf.SpecificationCombination;
import com.hf.SpecificationOption;
import com.hf.mapper.SpecificationMapper;
import com.hf.mapper.SpecificationOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/24.
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    private SpecificationMapper specificationMapper;
    @Autowired
    private SpecificationOptionMapper specificationOptionMapper;

    @Override
    public List<Specification> findAll() {
        return specificationMapper.findAll();
    }

    /**
     * 根据id查询规格
     * @param id
     * @return
     */
    @Override
    public SpecificationCombination findById(Long id) {
        SpecificationCombination specificationCombination = new SpecificationCombination();
        Specification specification = specificationMapper.findById(id);
        List<SpecificationOption> specificationOptionList = specificationOptionMapper.findBySpecId(id);
        specificationCombination.setSpecification(specification);
        specificationCombination.setSpecificationOptions(specificationOptionList);
        return specificationCombination;
    }

    @Override
    public void insert(SpecificationCombination specificationCombination) {
        specificationMapper.insert(specificationCombination.getSpecification());
        List<SpecificationOption> specificationOptions = specificationCombination.getSpecificationOptions();
        specificationOptions.stream().forEach(t->{
            t.setSpecId(specificationCombination.getSpecification().getId());
            specificationOptionMapper.insert(t);
        });
    }

    @Override
    public void update(SpecificationCombination specificationCombination) {
        specificationMapper.update(specificationCombination.getSpecification());
        List<SpecificationOption> specificationOptions = specificationCombination.getSpecificationOptions();
        specificationOptions.stream().forEach(t->specificationOptionMapper.update(t));
    }

    @Override
    public void delete(Long id) {
        specificationMapper.delete(id);
        List<SpecificationOption> specificationOptions = specificationOptionMapper.findBySpecId(id);
        specificationOptions.stream().forEach(t->{
            specificationOptionMapper.delete(t.getId());
        });
    }
}
