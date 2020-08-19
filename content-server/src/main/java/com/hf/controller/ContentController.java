package com.hf.controller;

import com.hf.Content;
import com.hf.Result;
import com.hf.service.ContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Content)表控制层
 *
 * @author makejava
 * @since 2020-08-17 09:58:11
 */
@RestController
@RequestMapping("content")
@Api(value = "for high fashion content")
public class ContentController {
    /**
     * 服务对象
     */
    @Resource
    private ContentService contentService;

    @GetMapping("findAll")
    @ApiOperation(value = "查询所有广告")
    public List<Content> findAll(){
        return contentService.findAll();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation(value = "根据id查询某条广告")
    public Content selectOne(Long id) {
        long start = System.currentTimeMillis();
        Content content = this.contentService.queryById(id);
        long end = System.currentTimeMillis();
        System.out.println("查询耗时："+(end-start)+"ms");
        return content;
    }

    @PostMapping("add")
    @ApiOperation(value = "插入一条广告")
    public Result insert(@RequestBody Content content){
        Result result = new Result();
        try {
            contentService.insert(content);
            result.setStatus(true);
            result.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("插入失败！");
        }
        return result;
    }
}