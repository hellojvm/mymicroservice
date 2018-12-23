package com.fd.service.biz;

import com.fd.service.biz.base.IBaseService;

public interface IApiService extends IBaseService {

	void saveOrder(String orderNo, String username);

}
