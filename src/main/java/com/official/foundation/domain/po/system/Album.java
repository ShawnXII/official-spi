package com.official.foundation.domain.po.system;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.common.collect.Sets;
import com.official.core.base.entity.BaseEntity;
import com.official.foundation.domain.po.user.Account;
@Entity
@Table(name = "system_album")
public class Album extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2829468653092538868L;
	@Column(name = "title",nullable=false)
	private String title;
		
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "album_accessory", joinColumns = {
			@JoinColumn(name = "album_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "accessory_id", referencedColumnName = "id") })
	private Set<Accessory> accessory = Sets.newHashSet();
	
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE })
    @JoinColumn(name = "account_id")
	private Account account;
	
	//用途
	@Column(name = "purpose")
	private String purpose;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Accessory> getAccessory() {
		return accessory;
	}

	public void setAccessory(Set<Accessory> accessory) {
		this.accessory = accessory;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
}
