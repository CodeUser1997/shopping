package com.sulongx.common.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 描述:
 * 分页公共类
 *
 * @author xiongsulong
 * @create 2019-07-22 20:41
 */
@ToString
public class PageResult<T> {
    /**
     * 总条数
     */
    @Getter
    @Setter
    private Long total;

    /**
     * 总页数
     */
    @Getter
    @Setter
    private Integer totalPage;

    /**
     * 数据集
     */
    @Getter
    @Setter
    private List<T> items;

    public PageResult(Long total,List<T> items){
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total,Integer totalPage,List<T> items){
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
