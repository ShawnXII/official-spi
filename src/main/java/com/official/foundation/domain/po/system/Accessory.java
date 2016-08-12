package com.official.foundation.domain.po.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;
/**
 * 图片管理
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_accessory")
public class Accessory extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 242812642437939986L;
	
	@Column(name = "name",nullable=false)
	private String name;
	//照片类型 max center min
	@Column(name = "type",nullable=false)
	private String type;
	
	@Column(name = "Suffix",nullable=false)
	private String Suffix;
	
	@Column(name = "path",nullable=false)
	private  String path;
	
	@Column(name = "size",nullable=false)
	private Double size;
	
	@Column(name = "weight",nullable=false)
	private Double weight;
	
	@Column(name = "height",nullable=false)
	private Double height;
	
	@Column(name = "info")
	private String info;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuffix() {
		return Suffix;
	}

	public void setSuffix(String suffix) {
		Suffix = suffix;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
	
}
