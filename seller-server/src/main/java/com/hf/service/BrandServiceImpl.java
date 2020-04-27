package com.hf.service;

import com.hf.Brand;
import com.hf.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

    @Override
    public Brand findById(Integer id) {
        return brandMapper.findById(id);
    }

    @Override
    public void insert(Brand brand) {
        brandMapper.insert(brand);
    }

    @Override
    public void update(Brand brand) {
         brandMapper.update(brand);
    }

    @Override
    public void delete(Integer id) {
         brandMapper.delete(id);
    }
}
