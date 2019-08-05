package com.sulongx.service.impl;

import com.sulongx.item.pojo.Category;
import com.sulongx.mapper.CategoryMapper;
import com.sulongx.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * 商品类目服务层实现类
 *
 * @author xiongsulong
 * @create 2019-07-21 18:44
 */
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryCategoryListByPid(Long pId) {
        Category category = new Category();
        category.setParentId(pId);
        return categoryMapper.select(category);
    }

    @Override
    public Category queryCategoryById(Long id) {
        Category category = new Category();
        category.setId(id);
        return categoryMapper.selectByPrimaryKey(category);
    }
}
