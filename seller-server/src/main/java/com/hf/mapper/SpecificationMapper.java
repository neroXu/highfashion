package com.hf.mapper;

import com.hf.Brand;
import com.hf.Specification;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecificationMapper {

    @Select("select * from specification")
    @Results(id = "specificationMap",value = {@Result(property = "specName",column = "spec_name")})
    List<Specification> findAll();

    @Select("select * from specification where id=#{id}")
    @ResultMap("specificationMap")
    Specification findById(Long id);

    @Insert("insert into specification (spec_name) values(#{specName})")
    @ResultMap("specificationMap")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(Specification specification);

    @Update("update specification set spec_name=#{specName} where id=#{id}")
    @ResultMap("specificationMap")
    void update(Specification specification);

    @Delete("delete from specification where id=#{id}")
    @ResultMap("specificationMap")
    void delete(Long id);
}