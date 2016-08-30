package com.official.foundation.domain.po.user;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;
import com.official.foundation.domain.po.system.Role;

/**
 * 帐号信息
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_account")
public class Account extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4767273679993411626L;
	
	@Column(name = "username",unique=true,nullable=false)
	private String username;
	//密码
	@Column(name = "password",nullable=false)
	private String password;
	//盐值
	@Column(name = "salt",nullable=false)
	private String salt;
	//手机
	@Column(name = "mobile",length=15)
	private String mobile;
	//手机验证状态  0:false 1:true
	@Column(name = "mobile_state")
	private Integer mobileState;
	//邮箱
	@Column(name = "email")
	private String email;	
	//邮箱验证状态 0:false 1:true
	@Column(name = "email_state")
	private Integer emailState;
	
	@Column(name = "nickname")
	private String nickname;
	//支付密码
	@Column(name = "pay_password")
	private String payPassword;
	//形象照
	@Column(name = "image")
	private String image;
	
	//账号状态 0:正常 1:锁定 2:禁用 
	@Column(name = "state")
	private Integer state;
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    @JoinColumn(name = "role_id")
	private Role role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getMobileState() {
		return mobileState;
	}

	public void setMobileState(Integer mobileState) {
		this.mobileState = mobileState;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEmailState() {
		return emailState;
	}

	public void setEmailState(Integer emailState) {
		this.emailState = emailState;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", salt=" + salt + ", mobile=" + mobile
				+ ", mobileState=" + mobileState + ", email=" + email + ", emailState=" + emailState + ", nickname="
				+ nickname + ", payPassword=" + payPassword + ", image=" + image + ", state=" + state + ", role=" + role
				+ "]";
	}
	
}
