package com.official.foundation.domain.po.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 任务管理
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "system_task")
public class SystemTask extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6079634277426609243L;
	//区分颜色
	@Column(name="color")
	private String color;
	//任务类别 需要系统支持的类别 该任务才会有效
	@Column(name="type",nullable=false)
	private String type;
	//任务开始时间
	@Column(name="start_time")
	private Long startTime;
	//任务结束时间
	@Column(name="end_time")
	private Long endTime;
	//任务标题
	@Column(name="title",nullable=false)
	private String title;
	//任务说明
	@Column(name="info")
	private String info;
	//任务图标标识
	@Column(name="icon")
	private String icon;
	//状态 0:正常 1:禁用 2:正在运行中 所有的任务管理都需要延时一小时建立
	@Column(name="state")
	private Integer state=0;
	//启动类型 0:循环任务 单位为天  1:循环任务 单位为月  2:循环任务 单位为年 3:一次性任务 单位为年
	private Integer startType;
	
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
	public Long getStartTime() {
		return startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getEndTime() {
		return endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getStartType() {
		return startType;
	}
	public void setStartType(Integer startType) {
		this.startType = startType;
	}			
}
