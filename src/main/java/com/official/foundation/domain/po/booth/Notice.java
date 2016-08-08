package com.official.foundation.domain.po.booth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 公告
 * 
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "booth_notice")
public class Notice extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7605458748642032352L;
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "info", nullable = false)
	private String info;
	@Column(name = "type", nullable = false)
	private String type;
	@Column(name = "state", nullable = false)
	private Integer state;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
