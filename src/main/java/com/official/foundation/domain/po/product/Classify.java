package com.official.foundation.domain.po.product;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.collect.Lists;
import com.official.core.base.entity.BaseEntity;
/**
 * 产品分类
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "business_classify")
public class Classify extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -996462580114594805L;
	
	@Column(name = "title",nullable=false)
	private String title;
	
	@Column(name = "icon")
	private String icon;
	
	@Column(name = "keywords")
	private String keywords;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "parent_id")
	private Long parentId;
	//权重
	@Column(name = "weight")
	private Integer weight;
	
	@Column(name = "store_id")
	private Long storeId;
	
	//状态  0:正常 默认状态 1:禁用
	@Column(name = "state",nullable=false)
	private Integer state=0;
	
	@Transient
	private Classify parent;
	
	@Transient
	private List<Classify> childs=Lists.newArrayList();
	
	public Classify getParent() {
		return parent;
	}

	public void setParent(Classify parent) {
		this.parent = parent;
	}

	public List<Classify> getChilds() {
		return childs;
	}

	public void setChilds(List<Classify> childs) {
		this.childs = childs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
