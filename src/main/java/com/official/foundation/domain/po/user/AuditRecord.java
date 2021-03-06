package com.official.foundation.domain.po.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 审核记录
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_audit_record")
public class AuditRecord extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1539268558480001465L;
	//反馈信息
	@Column(name = "info", nullable = false)
	private String info;
	//审核状态 0:成功 1:失败
	@Column(name = "state", nullable = false)
	private Integer state;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
}
