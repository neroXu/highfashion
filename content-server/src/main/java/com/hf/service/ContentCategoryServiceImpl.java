package com.hf.service;

import com.hf.ContentCategory;
import com.hf.mapper.ContentCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 内容分类(ContentCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-08-17 09:38:11
 */
@Service("contentCategoryService")
public class ContentCategoryServiceImpl implements ContentCategoryService {
    @Resource
    private ContentCategoryMapper contentCategoryMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ContentCategory queryById(Long id) {
        return this.contentCategoryMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ContentCategory> queryAllByLimit(int offset, int limit) {
        return this.contentCategoryMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param contentCategory 实例对象
     * @return 实例对象
     */
    @Override
    public ContentCategory insert(ContentCategory contentCategory) {
        this.contentCategoryMapper.insert(contentCategory);
        return contentCategory;
    }

    /**
     * 修改数据
     *
     * @param contentCategory 实例对象
     * @return 实例对象
     */
    @Override
    public ContentCategory update(ContentCategory contentCategory) {
        this.contentCategoryMapper.update(contentCategory);
        return this.queryById(contentCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.contentCategoryMapper.deleteById(id) > 0;
    }
}