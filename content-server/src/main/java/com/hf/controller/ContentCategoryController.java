package com.hf.controller;

import com.hf.ContentCategory;
import com.hf.service.ContentCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 内容分类(ContentCategory)表控制层
 *
 * @author makejava
 * @since 2020-08-17 09:38:19
 */
@RestController
@RequestMapping("contentCategory")
public class ContentCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private ContentCategoryService contentCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ContentCategory selectOne(Long id) {
        return this.contentCategoryService.queryById(id);
    }

}