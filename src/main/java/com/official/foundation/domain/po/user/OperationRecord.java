package com.official.foundation.domain.po.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.official.core.base.entity.BaseEntity;

/**
 * 登录记录
 * @author ShawnXII
 * @Version 1.0
 */
@Entity
@Table(name = "user_operation_record")
public class OperationRecord extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4194991470410338463L;
	//登录IP
	@Column(name="ip")
	private String ip;
	//设备 APP PC TOUCH
	@Column(name="equipment",nullable=false)
	private String equipment;
	//尝试次数
	@Column(name="num",nullable=false)
	private Integer num;
	//登录城市
	@Column(name="city")
	private String city;
	//错误信息
	@Column(name="error_msg")
	private String errorMsg;
	
	@Column(name="state",nullable=false)
	private Integer state;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
		
}
