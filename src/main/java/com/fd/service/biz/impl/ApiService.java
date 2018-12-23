package com.fd.service.biz.impl;

import org.springframework.stereotype.Service;

import com.fd.myshardingfordata.annotation.MyTransaction;
import com.fd.service.biz.IApiService;
import com.fd.service.biz.base.impl.BaseService;
import com.fd.service.domain.OrderInfo;
import com.fd.service.domain.UserInfo;

@Service
public class ApiService extends BaseService implements IApiService {
	@Override
	@MyTransaction
	public void saveOrder(String orderNo, String username) {
		UserInfo u = new UserInfo(username, "139000999999");
		getUserInfoDao().save(u);
		getOrderInfoDao().save(new OrderInfo(orderNo, u.getSid()));
	}
}
