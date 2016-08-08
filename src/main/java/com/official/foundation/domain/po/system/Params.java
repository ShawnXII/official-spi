package com.official.foundation.domain.po.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.AbstractEntity;

/**
 * 系统参数
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_params")
public class Params extends AbstractEntity<Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5902696145293801356L;

	@Column(name="key",nullable=false)
	private String key;
	
	@Column(name="value",nullable=false)
	private String value;
	//参数说明
	@Column(name="info")
	private String info;
	
	@Column(name="config_params_id",nullable=false)
	private Long configParamsId;
	
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
	@Override
	public String toString() {
		return "Params [key=" + key + ", value=" + value + ", info=" + info + ", configParamsId=" + configParamsId
				+ "]";
	}	
}
