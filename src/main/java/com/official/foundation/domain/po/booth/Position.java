package com.official.foundation.domain.po.booth;

import java.math.BigDecimal;

import javax.persistence.Column;

import com.official.core.base.entity.BaseEntity;

/**
 * 展位位置
 * 
 * @author ShawnXII
 * @Version 1.0
 */
public class Position extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1510928549634267313L;
	// 位置名称
	@Column(name="title",nullable=false)
	private String title;
	// 位置说明
	@Column(name="info")
	private String info;
	
	// 位置属性 最大数目
	@Column(name="max_size",nullable=false)
	private Integer maxSize;
	
	// 位置属性 图片宽度
	@Column(precision = 12, scale = 2,name="weight")
	private BigDecimal weight;
	
	// 位置属性 图片高度
	@Column(precision = 12, scale = 2,name="height")
	private BigDecimal height;
	
	// 位置代号ICON 用于后台区分
	@Column(name="icon")
	private String icon;
	
	// 该属性用于后台区分展位位置
	@Column(name="color")
	private String color;
	// 位置类别 commondity:接收 商品数据 news:接收新闻数据 movie:接收视频连接参数 notice:通知 custom:自定义
	@Column(name="type",nullable=false)
	private String type;
	// 用于定位位置
	@Column(name="position")
	private String position;
	// 状态 0:正常 1:禁用
	@Column(name="state")
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
	public Integer getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}

	

}
