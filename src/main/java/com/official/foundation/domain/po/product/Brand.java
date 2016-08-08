package com.official.foundation.domain.po.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;
/**
 * 商品品牌
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "business_brand")
public class Brand extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6734870394616349624L;
	//品牌名称
	@Column(name="title",nullable=false)
	private String title;
	//权重 值越大 排序越靠前
	@Column(name="weight")
	private Integer weight;
	//品牌标识
	@Column(name="image")
	private String image;
	//状态 0:正常 1:禁用 默认0	
	@Column(name="state",nullable=false)
	private Integer state=0;
	
	//首字母 系统自动建立
	@Column(name = "first_word",nullable=false,length=1)
	private String firstWord;
	
	//是否推荐
	@Column(name="is_recommend")
	private boolean isRecommend=false;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getFirstWord() {
		return firstWord;
	}

	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}

	public boolean isRecommend() {
		return isRecommend;
	}

	public void setRecommend(boolean isRecommend) {
		this.isRecommend = isRecommend;
	}
}
