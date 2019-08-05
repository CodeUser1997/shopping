package com.sulongx.service;

import com.sulongx.common.pojo.PageResult;
import com.sulongx.item.pojo.Brand;

import java.util.List;

/**
 * 描述:
 * 品牌服务层接口
 *
 * @author xiongsulong
 * @create 2019-07-22 20:39
 */
public interface BrandService {

    /**
     * 分页条件查询
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @return
     */
    PageResult<Brand> queryBrandsByPage(String key,Integer page,Integer rows,String sortBy,Boolean desc);

    /**
     * 新增品牌
     * @param brand
     * @param cids
     */
    void saveBrand(Brand brand, List<Long> cids);
}
