package com.official.foundation.domain.po.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 供应商信息
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_store")
public class UserStore extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -128644779485338457L;
	@Column(name="name",nullable=false)
	private String name;
	
	//公司名称
	@Column(name="company_name")
	private String companyName;
	//手机号码 可以有多个
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="qq")
	private String qq;
	//客服电话
	@Column(name="customer_phone")
	private String customerPhone;
	//公司地址
	@Column(name="city")
	private String city;
	
	//百度地图坐标X
	@Column(precision = 12, scale = 2,name="coordinate_x")
	private Double coordinateX;
	
	//百度地图坐标Y
	@Column(precision = 12, scale = 2,name="coordinate_y")
	private Double coordinateY;
	
	//资质说明
	@Column(name="qualifications")
	private String qualifications;
	
	//说明
	@Column(name="no")
	private String info;

	
	//经营许可证(照片)
	@Column(name="licence")
	private String licence;
	
	//供应商状态 0:正常 1:关闭
	@Column(name="state")
	private Integer state;
	//类别
	@Column(name="type")
	private String type;
	//区域
	@Column(name="region")
	private String region;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(Double coordinateX) {
		this.coordinateX = coordinateX;
	}
	public Double getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(Double coordinateY) {
		this.coordinateY = coordinateY;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
}
