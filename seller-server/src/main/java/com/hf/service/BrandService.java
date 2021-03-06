package com.hf.service;

import com.github.pagehelper.PageInfo;
import com.hf.Brand;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
public interface BrandService {
    List<Brand> findAll();

    Brand findById(Integer id);

    void insert(Brand brand);

    void update(Brand brand);

    void delete(Integer id);

    List<Brand> findList(Brand brand);

    PageInfo<Brand> findByPage(int page, int size);
}
