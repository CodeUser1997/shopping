package com.sulongx.item.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 描述:
 * 品牌
 *
 * @author xiongsulong
 * @create 2019-07-22 20:23
 */
@Table(name = "tb_brand")
@ToString
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    /**
     * 品牌名称
     */
    @Getter
    @Setter
    private String name;

    /**
     * 品牌图片
     */
    @Getter
    @Setter
    private String image;

    /**
     * 品牌首写字母
     */
    @Getter
    @Setter
    private Character letter;

}
