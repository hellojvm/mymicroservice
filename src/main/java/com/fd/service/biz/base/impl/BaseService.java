package com.fd.service.biz.base.impl;

import javax.annotation.Resource;

import com.fd.service.biz.base.IBaseService;
import com.fd.service.dao.IOrderInfoDao;
import com.fd.service.dao.IUserInfoDao;

public class BaseService implements IBaseService {
	@Resource
	private IUserInfoDao userInfoDao;
	@Resource
	private IOrderInfoDao orderInfoDao;

	@Override
	public IUserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	@Override
	public IOrderInfoDao getOrderInfoDao() {
		return orderInfoDao;
	}

}
