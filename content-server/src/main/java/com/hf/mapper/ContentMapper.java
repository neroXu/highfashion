package com.hf.mapper;

import com.hf.Content;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/8/16.
 */
@Repository
public interface ContentMapper {
    /**
     * 查询所有
     * @return
     */
    List<Content> findAll();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Content queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Content> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param content 实例对象
     * @return 对象列表
     */
    List<Content> queryAll(Content content);

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 影响行数
     */
    int insert(Content content);

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 影响行数
     */
    int update(Content content);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
}
