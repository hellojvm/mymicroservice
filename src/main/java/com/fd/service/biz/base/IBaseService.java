package com.fd.service.biz.base;

import com.fd.service.dao.IOrderInfoDao;
import com.fd.service.dao.IUserInfoDao;

public interface IBaseService {

	IUserInfoDao getUserInfoDao();

	IOrderInfoDao getOrderInfoDao();

}
