package com.official.foundation.domain.po.system;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.google.common.collect.Sets;
import com.official.core.base.entity.BaseEntity;

/**
 * 权限组
 * 
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_power")
public class Power extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8335526038247107211L;
	// 权限组名称
	@Column(name = "title", nullable = false, length = 64)
	private String title;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinTable(name = "power_resource", joinColumns = {
			@JoinColumn(name = "power_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "resources_id", referencedColumnName = "id") })
	private Set<SystemResource> resources = Sets.newHashSet();
	// 说明
	@Column(name = "info")
	private String info;

	@ManyToMany(mappedBy = "powers")
	private Set<Role> roles = Sets.newHashSet();

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<SystemResource> getSystemResources() {
		return resources;
	}

	public void setSystemResources(Set<SystemResource> resources) {
		this.resources = resources;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
