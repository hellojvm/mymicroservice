package com.fd.service.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fd.microSevice.web.PortApplicationListener;
import com.fd.myshardingfordata.em.Operate;
import com.fd.myshardingfordata.helper.ObData;
import com.fd.myshardingfordata.helper.Param;
import com.fd.service.domain.UserInfo;
import com.fd.service.web.controller.base.BaseController;

@RestController
@RequestMapping("/home")
public class HomeController extends BaseController {
	@RequestMapping("/hello")
	public String hello() {
		return "world" + PortApplicationListener.PORT;
	}

	@RequestMapping("/saveUser")
	public String save(String username) {
		apiService.getUserInfoDao().save(new UserInfo(username, "198939399393"));
		return String.valueOf(apiService.getUserInfoDao().getCount(null));
	}

	@RequestMapping("/saveOrder")
	public String saveOrder(String orderNo, String username) {
		apiService.saveOrder(orderNo, username);
		return String.valueOf(apiService.getOrderInfoDao().getCount(null));
	}

	@RequestMapping("/getusername")
	public String getNewusername() {
		return apiService.getUserInfoDao().getList(1, 1, ObData.getSet(new ObData("sid", true)),
				Param.getParams(new Param("username", Operate.NOT_EQ, null)), "username").get(0).getUsername();
	}
}
