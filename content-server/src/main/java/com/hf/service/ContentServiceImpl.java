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
        return contentMapper.queryById(id);
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
    public void insert(Content content) {
        this.contentMapper.insert(content);
        //新增数据后删Redis除缓存
        redisTemplate.boundHashOps("content").delete(content.getCategoryId());
    }

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    @Override
    public void update(Content content) {
        //先去数据库查询旧的categoryId,有缓存就删除
        Long categoryId = contentMapper.queryById(content.getId()).getCategoryId();
        redisTemplate.boundHashOps("content").delete(categoryId);
        this.contentMapper.update(content);
        //如果categoryId发生了变更，删除缓存数据
        if (categoryId.compareTo(content.getCategoryId())!=0){
            redisTemplate.boundHashOps("content").delete(content.getCategoryId());
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(Long id) {
        Long categoryId = contentMapper.queryById(id).getCategoryId();
        redisTemplate.boundHashOps("content").delete(categoryId);
        this.contentMapper.deleteById(id);

    }


    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Content> findAll() {
        return contentMapper.findAll();
    }

    /**
     * 根据categoryId查询广告
     *
     * @param categoryId
     * @return
     */
    @Override
    public List<Content> findByCategoryId(Long categoryId) {
        //去redis中查询是否存在
        List<Content> list = (List<Content>) redisTemplate.boundHashOps("content").get(categoryId);
        if (list == null) {
            System.out.println("从数据库查询数据并放入缓存中");
            //从数据库读取数据并放入Redis缓存中
            list = contentMapper.findByCategoryId(categoryId);
            redisTemplate.boundHashOps("content").put(categoryId, list);
        } else {
            System.out.println("从Redis缓存中读取数据");
        }
        return list;
    }
}