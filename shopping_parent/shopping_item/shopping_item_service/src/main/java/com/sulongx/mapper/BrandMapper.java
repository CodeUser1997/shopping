package com.sulongx.mapper;

import com.sulongx.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * 描述:
 * 品牌Mapper
 *
 * @author xiongsulong
 * @create 2019-07-22 20:37
 */
public interface BrandMapper extends Mapper<Brand> {

    /**
     * 插入中间表
     * @param cid 品牌id
     * @param bid 商品id
     * @return
     */
    @Insert("insert into tb_category_brand(category_id,brand_id) values(#{cid},#{bid})")
    public int insertBrandAndCategory(@Param("cid") Long cid,@Param("bid") Long bid);
}
