package com.hf.controller;

import com.hf.Brand;
import com.hf.Result;
import com.hf.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
@RestController
@Api(value = "for brand")
@RequestMapping("/brand")
public class HFBrandController {


    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ApiOperation(value = "获取所有品牌")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    @ApiOperation(value = "根据id获取某个品牌")
    public Brand findById(@PathVariable Integer id) {
        return brandService.findById(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ApiOperation(value = "新增一个品牌")
    public Result save(Brand brand) {
        try {
            brandService.insert(brand);
            return new Result(true, "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败！");
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改品牌")
    public Result update(Brand brand) {
        try {
            brandService.update(brand);
            return new Result(true, "修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true, "修改失败！");
        }
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ApiOperation(value = "删除品牌")
    public Result delete(Integer id) {
        try {
            brandService.delete(id);
            return new Result(true, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true, "删除失败！");
        }
    }
}
