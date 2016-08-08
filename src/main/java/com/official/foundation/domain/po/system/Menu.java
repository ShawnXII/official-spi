package com.official.foundation.domain.po.system;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.collect.Lists;
import com.official.core.base.entity.BaseEntity;

/**
 * 系统菜单
 * 
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_menu")
public class Menu extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5520837378980162211L;

	// 菜单类型 0:系统菜单 1:前端菜单
	@Column(name = "type", nullable = false)
	private Integer type;
	//菜单title
	@Column(name = "title", nullable = false)
	private String title;
	//链接
	@Column(name = "url")
	private String url;
	//跳转方式
	@Column(name = "target")
	private String target;
	//菜单样式
	@Column(name = "style")
	private String style;
	//图标
	@Column(name = "icon")
	private String icon;
	//上级菜单
	@Column(name = "parent_id")
	private Long parentId;
	
	@Transient
	private Menu parent;
	@Transient
	private List<Menu> childs = Lists.newArrayList();
	// 排序
	@Column(name = "sequence")
	private Integer sequence;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public List<Menu> getChilds() {
		return childs;
	}

	public void setChilds(List<Menu> childs) {
		this.childs = childs;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
}
