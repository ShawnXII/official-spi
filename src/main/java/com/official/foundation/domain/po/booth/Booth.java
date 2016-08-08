package com.official.foundation.domain.po.booth;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.official.core.base.entity.BaseEntity;

/**
 * 展位
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "booth_info")
public class Booth extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4994878918657632056L;
	//商品ID
	@Column(name="commodity_id")
	private Long commodityId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;
	
	@Column(name="title",nullable=false)
	private String title;
	
	@Column(name="title")
	private String images;
	//当商品ID为空或者商品不存在时,该字段才有效
	@Column(name="url")
	private String url;
	//当商品ID为空或者商品不存在时,该字段才有效  默认值_self
	@Column(name="target")
	private String target;
	
	//展位类型
	@Column(name="type")
	private String type;
	//展位位置
	@Column(name="position_id",nullable=false)
	private Long positionId;
	
	//展位位置
	@Transient
	private Position position;

	public Long getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getPositionId() {
		return positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
