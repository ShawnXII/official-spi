package com.official.foundation.domain.po.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 系统字典
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_dict")
public class Dict extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7857569021957266186L;
	@Column(name="key",nullable=false)
	private String key;
	
	@Column(name="value",nullable=false)
	private String value;
	
	@Column(name="info")
	private String info;
	
	@Column(name="type",nullable=false)
	private String type;
	
	@Column(name="state",nullable=false)
	private Integer state;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}	
}
