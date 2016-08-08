package com.official.foundation.domain.po.user;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.official.core.base.entity.BaseEntity;

/**
 * 会员信息
 * 
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_info")
public class User extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9163984735370648259L;

	@OneToOne(optional = true, cascade = CascadeType.ALL, mappedBy = "user")
	private Account account;
	//姓名
	@Column(name = "name",nullable=false)
	private String name;
	//性别 0:女  1:男 2:保密
	@Column(name = "sex",nullable=false)
	private Integer sex;
	//年龄
	@Column(name = "age")
	private Integer age;
	//最高学历
	@Column(name = "education")
	private String education;
	//薪资水平
	@Column(name = "salary")
	private String salary;
	
	@Temporal(TemporalType.DATE)
	private Date birthday;
	//婚姻状况 0:未婚 1:已婚 2:单身父亲 3:单身母亲 4:单身汪 5:离异 6:保密
	@Column(name = "marriage",nullable=false)
	private Integer marriage;
	// 证件类型
	@Column(name = "document_type",nullable=false)
	private String documentType;
	// 证件号码
	@Column(name = "no", length = 30,nullable=false)
	private String no;
	// 证件照片
	@Column(name = "positive_photo",nullable=false)
	private String positivePhoto;
	// 反面照片
	@Column(name = "opposite_photo",nullable=false)
	private String oppositePhoto;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "store_id",referencedColumnName="id")
	private Store store;
	
	@Column(name = "state",nullable=false)
	private Integer state;
	
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getMarriage() {
		return marriage;
	}

	public void setMarriage(Integer marriage) {
		this.marriage = marriage;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPositivePhoto() {
		return positivePhoto;
	}

	public void setPositivePhoto(String positivePhoto) {
		this.positivePhoto = positivePhoto;
	}

	public String getOppositePhoto() {
		return oppositePhoto;
	}

	public void setOppositePhoto(String oppositePhoto) {
		this.oppositePhoto = oppositePhoto;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}
