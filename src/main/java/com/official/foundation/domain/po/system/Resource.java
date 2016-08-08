package com.official.foundation.domain.po.system;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.google.common.collect.Sets;
import com.official.core.base.entity.BaseEntity;

/**
 * 系统资源表 每次项目启动更新
 * 功能点 每次系统录入时会检测一遍url是否有冲突的 如果有 则更改url的状态
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_resource")
public class Resource extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5687374983553860156L;
	//资源url
	@Column(name = "title", nullable = false,unique=true,length=64)
	private String url;
	//所属的类
	@Column(name = "class_name",nullable = false)
	private String className;
	//访问类型 POST,GET
	@Column(name = "request_method",length=32)
	private String requestMethod;
	//来源 system:系统  user:用户
	@Column(name = "source",length=32)
	private String source;
	//资源说明
	@Column(name = "info")
	private String info;
	
	//用途 如果是系统录入的 则根据返回值判断该资源的用途
	@Column(name = "purpose",length=32)
	private String purpose;
	//状态 只要 url参数里面带有{xx} 则状态为 1:待修改  0:正常 
	@Column(name = "state")
	private Integer state;
	
	 @ManyToMany(mappedBy = "resources")
	 private Set<Power> powers=Sets.newHashSet();
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}	
}
