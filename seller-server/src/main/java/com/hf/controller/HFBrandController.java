package com.hf.controller;

import com.hf.Brand;
import com.hf.Result;
import com.hf.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
@RestController
@RequestMapping("/brand")
public class HFBrandController {


    @Autowired
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @RequestMapping("/findById")
    public Brand findById(Integer id) {
        return brandService.findById(id);
    }

    @RequestMapping("/save")
    public Result save(Brand brand) {
        try {
            brandService.insert(brand);
            return new Result(true, "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败！");
        }
    }

    @RequestMapping("/update")
    public Result update(Brand brand) {
        try {
            brandService.update(brand);
            return new Result(true, "修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true, "修改失败！");
        }
    }

    @RequestMapping("/delete")
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
