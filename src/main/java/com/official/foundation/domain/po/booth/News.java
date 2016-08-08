package com.official.foundation.domain.po.booth;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.official.core.base.entity.BaseEntity;
/**
 * 
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "booth_news")
public class News extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6753820968129913024L;
	
	@Column(name="title",nullable=false)
	private String title;
	
	@Column(name="sub_title")
	private String subTitle;
	
	@Column(name="keywords")
	private String keywords;
	
	@Column(name="description")
	private String description;	
	@Lob
	@Column(columnDefinition = "LongText",name="details",nullable=false)
	private String details;
	
	@Column(name="main_photo")
	private String mainPhoto;
	
	@Column(name="type")
	private String type;
	
	@Column(name="state")
	private Integer state;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="author")
	private String author;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="source",nullable=false)
	private String source;
	//推荐开始时间
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;
	//推荐结束时间
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMainPhoto() {
		return mainPhoto;
	}

	public void setMainPhoto(String mainPhoto) {
		this.mainPhoto = mainPhoto;
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

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	

}
