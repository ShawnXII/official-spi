package com.official.foundation.domain.po.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 用户意见反馈
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_feedback")
public class UserFeedback extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1171567303308777618L;
	
	@Column(name="info",nullable=false)
	private String info;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="qq")
	private String qq;
	//
	@Column(name="email")
	private String email;
	//名称
	@Column(name="name",nullable=false)
	private String name;
	//状态 0:创建  1:正在处理 2:处理完成
	@Column(name="state",nullable=false)
	private Integer state;
	//处理结果
	@Column(name="result")
	private String result;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
