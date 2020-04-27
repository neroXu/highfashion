package com.hf.mapper;

import com.hf.Specification;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/24.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpecificationMapperTest {
    @Autowired
    private SpecificationMapper specificationMapper;
    @Test
    public void findAll() throws Exception {
        List<Specification> list = specificationMapper.findAll();
        list.stream().forEach(t-> System.out.println(t));
    }

    @Test
    public void findById() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}