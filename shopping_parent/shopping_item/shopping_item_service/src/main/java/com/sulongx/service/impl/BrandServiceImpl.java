package com.sulongx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sulongx.common.pojo.PageResult;
import com.sulongx.item.pojo.Brand;
import com.sulongx.mapper.BrandMapper;
import com.sulongx.service.BrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 描述:
 * 品牌服务层实现类
 *
 * @author xiongsulong
 * @create 2019-07-22 20:40
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;


    @Override
    public PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc) {
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();

        //查询条件
        if(StringUtils.isNotBlank(key)){
            criteria.andLike("name","%" + key + "%").orEqualTo("letter",key);
        }

        //分页条件
        PageHelper.startPage(page,rows);

        //添加排序条件
        if(StringUtils.isNotBlank(sortBy)){
            example.setOrderByClause(sortBy + " " + (desc ? "desc":"asc"));
        }
        List<Brand> brandList = brandMapper.selectByExample(example);
        //封装成PageInfo
        PageInfo pageInfo = new PageInfo(brandList);

        return new PageResult<Brand>(pageInfo.getTotal(),pageInfo.getList());
    }

    @Override
    @Transactional
    public void saveBrand(Brand brand, List<Long> cids) {
        //先增加品牌
        this.brandMapper.insertSelective(brand);
        //再增加品牌和商品分类的中间表
        cids.forEach(cid -> {
            this.brandMapper.insertBrandAndCategory(cid,brand.getId());
        });
    }
}
