package com.sulongx.service;

import com.sulongx.item.pojo.Category;

import java.util.List;

/**
 * 描述:
 * 商品类目服务层接口
 *
 * @author xiongsulong
 * @create 2019-07-21 18:43
 */
public interface CategoryService {

    /**
     * 根据父id查询子商品类目
     * @param pId
     * @return
     */
    List<Category> queryCategoryListByPid(Long pId);

    /**
     * 通过id查询商品类目详情
     * @param id
     * @return
     */
    Category queryCategoryById(Long id);
}
