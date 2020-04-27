package com.hf.mapper;

import com.hf.Brand;
import com.hf.SpecificationOption;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecificationOptionMapper {

    @Select("select * from specification_option")
    @Results(id = "specificationOptionMap",value = {@Result(property = "optionName",column = "option_name"),
            @Result(property = "specId",column = "spec_id")})
    List<SpecificationOption> findAll();

    /**
     * 根据主键查找规格选项
     * @param id
     * @return
     */
    @Select("select * from specification_option where id=#{id}")
    @ResultMap("specificationOptionMap")
    SpecificationOption findById(Integer id);

    /**
     * 根据规格id查询规格选项
     * @param id
     * @return
     */
    @Select("select * from specification_option where spec_id=#{specId}")
    @ResultMap("specificationOptionMap")
    List<SpecificationOption> findBySpecId(Long id);

    @Insert("insert into specification_option (id, option_name, spec_id,orders) values(#{id}, #{optionName}, #{specId}, #{orders})")
    @ResultMap("specificationOptionMap")
    void insert(SpecificationOption specificationOption);

    @Update("update specification_option set option_name = #{optionName}, spec_id = #{specId}, orders = #{orders} where id=#{id}")
    @ResultMap("specificationOptionMap")
    void update(SpecificationOption specificationOption);

    @Delete("delete from specification_option where id=#{id}")
    @ResultMap("specificationOptionMap")
    void delete(Long id);
}