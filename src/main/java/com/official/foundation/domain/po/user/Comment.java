package com.official.foundation.domain.po.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 用户评论
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_comment")
public class Comment extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3646456486551856203L;
	//评论类型
	@Column(name = "type", nullable = false)
	private String type;
	//评论ID
	@Column(name = "comment_id", nullable = false)
	private Long commentId;
	//评论内容
	@Lob
	@Column(columnDefinition = "LongText",name="info")
	private String info;
	
	//是否喜欢
	@Column(name = "like")
	private Integer like;
	
	//评分
	@Column(name = "score")
	private Integer score;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	} 
	
}
