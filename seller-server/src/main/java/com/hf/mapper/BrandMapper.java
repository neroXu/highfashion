package com.hf.mapper;

import com.hf.Brand;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandMapper {

    @Select("select * from brand")
    @Results(id = "brandMap", value = {@Result(property = "firstChar", column = "first_char")})
    List<Brand> findAll();

    @Select("select * from brand where id=#{id}")
    @ResultMap("brandMap")
    Brand findById(Integer id);

    @Insert("insert into brand (name, first_char) values(#{name}, #{firstChar})")
    @ResultMap("brandMap")
    void insert(Brand brand);

    @Update("update brand set name=#{name}, first_char=#{first_char} where id=#{id}")
    @ResultMap("brandMap")
    void update(Brand brand);

    @Delete("delete from brand where id=#{id}")
    @ResultMap("brandMap")
    void delete(Integer id);

    @Select("<script> SELECT * from brand" +
            "<where>"+
            "<if test='name != null'>and name like CONCAT('%',#{name},'%') </if> "+
            " <if test='firstChar != null'>and first_char like CONCAT('%',#{firstChar},'%') </if> "+
            "</where>"+
            "</script>")
    @ResultMap("brandMap")
    List<Brand> findList(Brand brand);
}