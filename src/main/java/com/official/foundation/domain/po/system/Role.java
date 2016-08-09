package com.official.foundation.domain.po.system;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Sets;
import com.official.core.base.entity.BaseEntity;
import com.official.foundation.domain.po.user.Account;

/**
 * 角色
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_role")
public class Role extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1179511621127820241L;
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "role_power", joinColumns = {
			@JoinColumn(name = "role_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "power_id", referencedColumnName = "id") })
	private Set<Power> powers = Sets.newHashSet();
	
	@Column(name = "title",nullable=false)
	private String title;
	
	@Column(name = "code",nullable=false,unique=true)
	private String code;
	
	@Column(name = "info")
	private String info;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "role")
	private Set<Account> accounts=Sets.newHashSet();

	

	public Set<Power> getPowers() {
		return powers;
	}

	public void setPowers(Set<Power> powers) {
		this.powers = powers;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	} 
	
	
}
