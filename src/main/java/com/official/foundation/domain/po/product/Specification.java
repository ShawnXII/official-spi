package com.official.foundation.domain.po.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;
/**
 * 商品规格
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name="business_spec")
public class Specification extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5704304239947602529L;
	
	//规格类型 spec:规格参数 默认 function:功能参数
	@Column(name = "type",nullable=false)
	private String type;
	
	//规格值
	@Column(name = "title",nullable=false)
	private String title;
	
	//供应商ID
	@Column(name = "store_id")
	private Long storeId;
	
	//权重 值越大 排序越靠前
	@Column(name = "weight")
	private Integer weight;
	
	//首字母 方便检索
	@Column(name = "first_word",length=1,nullable=false)
	private String firstWord;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getFirstWord() {
		return firstWord;
	}

	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}
}
