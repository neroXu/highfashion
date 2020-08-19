package com.hf.mapper;

import com.hf.ContentCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/8/16.
 */
@Repository
public interface ContentCategoryMapper {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ContentCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ContentCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param contentCategory 实例对象
     * @return 对象列表
     */
    List<ContentCategory> queryAll(ContentCategory contentCategory);

    /**
     * 新增数据
     *
     * @param contentCategory 实例对象
     * @return 影响行数
     */
    int insert(ContentCategory contentCategory);

    /**
     * 修改数据
     *
     * @param contentCategory 实例对象
     * @return 影响行数
     */
    int update(ContentCategory contentCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
}
