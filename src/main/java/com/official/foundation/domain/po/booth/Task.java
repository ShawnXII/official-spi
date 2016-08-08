package com.official.foundation.domain.po.booth;

import java.util.Date;

import com.official.core.base.entity.BaseEntity;

/**
 * 展位任务(定时展示)
 * @author ShawnXII
 * @Version 1.0
 */
public class Task extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6079634277426609243L;
	//区分颜色
	private String color;
	//任务类别
	private String type;
	//任务开始时间
	private Date startTime;
	//任务结束时间
	private Date endTime;
	//任务标题
	private String title;
	//任务说明
	private String info;
	//任务图标标识
	private String icon;
	//状态
	private Integer state;
	
	
}
