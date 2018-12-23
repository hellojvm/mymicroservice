package com.fd.service.web.controller.base;

import javax.annotation.Resource;

import com.fd.service.biz.IApiService;

public class BaseController {
	@Resource
	protected IApiService apiService;
}
