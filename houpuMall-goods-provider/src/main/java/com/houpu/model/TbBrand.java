package com.houpu.model;

import lombok.Data;

@Data
public class TbBrand{
	/**
	 * 品牌id
	 */
	private Integer id;

	/**
	 * 品牌名称
	 */
	private String name;

	/**
	 * 品牌图片地址
	 */
	private String image;

	/**
	 * 品牌的首字母
	 */
	private String letter;

	/**
	 * 排序
	 */
	private Integer seq;
}

