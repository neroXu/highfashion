package com.hf.controller;

import com.hf.Brand;
import com.hf.Result;
import com.hf.Specification;
import com.hf.SpecificationCombination;
import com.hf.service.BrandService;
import com.hf.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Machenike-Pc on 2020/4/19.
 */
@RestController
@RequestMapping("/specification")
public class HFSpecificationController {


    @Autowired
    private SpecificationService specificationService;

    @RequestMapping("/findAll")
    public List<Specification> findAll() {
        return specificationService.findAll();
    }

    @RequestMapping("/findById")
    public SpecificationCombination findById(Long id) {
        return specificationService.findById(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(@RequestBody SpecificationCombination specificationCombination) {
        try {
            specificationService.insert(specificationCombination);
            return new Result(true, "添加成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败！");
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result update(@RequestBody SpecificationCombination specificationCombination) {
        try {
            specificationService.update(specificationCombination);
            return new Result(true, "修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true, "修改失败！");
        }
    }

    @RequestMapping("/delete")
    public Result delete(Long id) {
        try {
            specificationService.delete(id);
            return new Result(true, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true, "删除失败！");
        }
    }
}
