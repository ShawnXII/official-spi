package com.official.foundation.domain.po.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 商品规格值
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "business_property")
public class Property extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2178372780160527741L;
	//值
	@Column(name = "title",nullable=false)
	private String title;
	//供应商ID
	@Column(name = "store_id")
	private Long storeId;
	
	//权重 值越高 排序越靠前
	@Column(name = "weight")
	private String weight;
	
	//加入图片 更具有视觉冲击
	@Column(name = "images")
	private String images;
	
	//颜色
	@Column(name = "color")
	private String color;

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

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}
