package com.fd.service.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fd.myshardingfordata.annotation.MyIndex;

public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	@MyIndex
	private String username;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime = new Date();
	@Column(length = 31)
	private String mobile;

	public Long getSid() {
		return sid;
	}

	public UserInfo(String username, String mobile) {
		super();
		this.username = username;
		this.mobile = mobile;
	}

	public UserInfo() {
		super();
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
