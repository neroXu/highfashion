package com.hf.service;

import com.hf.ContentCategory;

import java.util.List;

/**
 * 内容分类(ContentCategory)表服务接口
 *
 * @author makejava
 * @since 2020-08-17 09:38:05
 */
public interface ContentCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ContentCategory queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ContentCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param contentCategory 实例对象
     * @return 实例对象
     */
    ContentCategory insert(ContentCategory contentCategory);

    /**
     * 修改数据
     *
     * @param contentCategory 实例对象
     * @return 实例对象
     */
    ContentCategory update(ContentCategory contentCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}