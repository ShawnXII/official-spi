package com.official.foundation.domain.po.system;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.collect.Lists;
import com.official.core.base.entity.BaseEntity;

/**
 * 系统配置
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_config")
public class SystemConfig extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9033118460138318846L;
	//公司名称
	@Column(name="corporate_name",nullable=false)
	private String corporateName;
	//网站favicon
	@Column(name="favicon",nullable=false)
	private String favicon;
	//状态 0:正常 1:禁用 所有数据永远只有一条的状态等于0
	@Column(name="state",nullable=false)
	private Integer state;
	//网站关键字 必填
	@Column(name="keywords",nullable=false)
	private String keywords;
	//网站说明 必填
	@Column(name="description",nullable=false)
	private String description;
	//后台登陆 背景图片 JSON 格式:[{'path':''}...]
	@Column(name="login_background_image",nullable=false)
	private String loginBackgroundImage;
	//系统版本
	@Column(name="version",nullable=false)
	private String version;
	//网站备案
	@Column(name="icp",nullable=false)
	private String icp;
	
	//配置参数 JSON 格式:[{'type':'dx'}........] 	
	@Transient
	private List<ConfigParams> paramsList=Lists.newArrayList();

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getFavicon() {
		return favicon;
	}

	public void setFavicon(String favicon) {
		this.favicon = favicon;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public String getLoginBackgroundImage() {
		return loginBackgroundImage;
	}

	public void setLoginBackgroundImage(String loginBackgroundImage) {
		this.loginBackgroundImage = loginBackgroundImage;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getIcp() {
		return icp;
	}

	public void setIcp(String icp) {
		this.icp = icp;
	}

	public List<ConfigParams> getParamsList() {
		return paramsList;
	}

	public void setParamsList(List<ConfigParams> paramsList) {
		this.paramsList = paramsList;
	}

	@Override
	public String toString() {
		return "SystemConfig [corporateName=" + corporateName + ", favicon=" + favicon + ", state=" + state
				+ ", keywords=" + keywords + ", description=" + description + ", loginBackgroundImage="
				+ loginBackgroundImage + ", version=" + version + ", icp=" + icp + ", paramsList=" + paramsList + "]";
	}
	
}
