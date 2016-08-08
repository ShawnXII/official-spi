package com.official.foundation.domain.po.system;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.collect.Lists;
import com.official.core.base.entity.BaseEntity;

/**
 * 配置参数
 * 
 * @author wx
 */
@Entity
@Table(name = "system_config_params")
public class ConfigParams extends BaseEntity<Long>{
	
	//参数类型 必填
	@Column(name="type",nullable=false)
	private String type;
	
	//所属配置ID
	@Column(name="system_config_id",nullable=false)
	private Long SystemConfigId;
	
	@Transient
	private List<Params> params=Lists.newArrayList();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSystemConfigId() {
		return SystemConfigId;
	}

	public void setSystemConfigId(Long systemConfigId) {
		SystemConfigId = systemConfigId;
	}

	public List<Params> getParams() {
		return params;
	}

	public void setParams(List<Params> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "ConfigParams [type=" + type + ", SystemConfigId=" + SystemConfigId + ", params=" + params + "]";
	}	
}
