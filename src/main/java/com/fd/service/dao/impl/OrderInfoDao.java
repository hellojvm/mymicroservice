package com.fd.service.dao.impl;

import org.springframework.stereotype.Repository;

import com.fd.myshardingfordata.dao.base.impl.DaoShardingBase;
import com.fd.service.dao.IOrderInfoDao;
import com.fd.service.domain.OrderInfo;

@Repository
public class OrderInfoDao extends DaoShardingBase<OrderInfo> implements IOrderInfoDao {

}
