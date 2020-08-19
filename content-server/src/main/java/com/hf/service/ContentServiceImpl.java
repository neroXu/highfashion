package com.hf.service;

import com.hf.Content;
import com.hf.mapper.ContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Content)表服务实现类
 *
 * @author makejava
 * @since 2020-08-17 09:58:10
 */
@Service("contentService")
public class ContentServiceImpl implements ContentService {
    @Resource
    private ContentMapper contentMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Content queryById(Long id) {
        Content content = (Content) redisTemplate.boundHashOps("content").get(id);
        if (content==null){
            System.out.println("从数据库查询");
            content = contentMapper.queryById(id);
            redisTemplate.boundHashOps("content").put(id,content);
        }else {
            System.out.println("从缓存中查询");
        }
        return content;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Content> queryAllByLimit(int offset, int limit) {
        return this.contentMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public Content insert(Content content) {
        this.contentMapper.insert(content);
        return content;
    }

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public Content update(Content content) {
        this.contentMapper.update(content);
        return this.queryById(content.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.contentMapper.deleteById(id) > 0;
    }


    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Content> findAll() {
        return contentMapper.findAll();
    }
}