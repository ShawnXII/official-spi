package com.official.foundation.domain.po.booth;

import java.util.Date;

import com.official.core.base.entity.BaseEntity;

/**
 * 展位
 * @author ShawnXII
 * @Version 1.0
 */
public class Booth extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4994878918657632056L;
	//商品ID
	private Long commodityId;
	
	private Date startTime;
	
	private Date endTime;
	
	private String title;
	
	private String images;
	
	private String url;
	
	private String target;
	
	private String type;
	
	private Long positionId;
	
	
}
