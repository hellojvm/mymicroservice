package com.fd.service.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fd.myshardingfordata.annotation.MyIndex;

public class OrderInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long sid;
	@Column(unique = true)
	@MyIndex
	private String orderNo;
	private Long userId;
	private Date createTime = new Date();

	public Long getSid() {
		return sid;
	}

	public OrderInfo(String orderNo, Long userId) {
		super();
		this.orderNo = orderNo;
		this.userId = userId;
	}

	public OrderInfo() {
		super();
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
