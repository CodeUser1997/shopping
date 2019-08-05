package com.sulongx.controller;

import com.sulongx.item.pojo.Category;
import com.sulongx.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述:
 * 商品类目控制层
 *
 * @author xiongsulong
 * @create 2019-07-21 18:42
 */
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据父id查询子商品类目
     * @param pid 父id
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryListByPid(@RequestParam("pid") Long pid){
        if(pid == null || pid.longValue() < 0){
            return ResponseEntity.badRequest().build();
        }
        List<Category> categoryList = categoryService.queryCategoryListByPid(pid);
        if(categoryList.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categoryList);
    }


    @GetMapping("/bid/{id}")
    public ResponseEntity<Category> queryCategoryById(@PathVariable("id") Long id){
        if(id == null || id.longValue() < 0){
            return ResponseEntity.badRequest().build();
        }
        Category category = categoryService.queryCategoryById(id);
        if(category == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(category);
    }


}
