package com.hf.mapper;

import com.hf.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandMapperTest {
    @Autowired
    private BrandMapper brandMapper;
    @Test
    public void findAll() {
        List<Brand> list = brandMapper.findAll();
        for (Brand brand : list) {
            System.out.println(brand);
        }
    }

    @Test
    public void testFindById(){
        Brand brand = brandMapper.findById(21);
        System.out.println(brand);
    }

    @Test
    public void testInsert(){
        Brand brand = new Brand();
        brand.setName("海尔");
        brand.setFirstChar("H");
        brandMapper.insert(brand);
    }

    @Test
    public void testDelete(){
        brandMapper.delete(25);
    }

}