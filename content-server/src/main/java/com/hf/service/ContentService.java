package com.hf.service;

import com.hf.Content;

import java.util.List;

/**
 * (Content)表服务接口
 *
 * @author makejava
 * @since 2020-08-17 09:58:09
 */
public interface ContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Content queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Content> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    void insert(Content content);

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    void update(Content content);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(Long id);

    /**
     * 查询所有记录
     * @return
     */
    List<Content> findAll();

    /**
     *
     * 根据categoryId查询广告
     * @param categoryId
     * @return
     */
    List<Content> findByCategoryId(Long categoryId);
}