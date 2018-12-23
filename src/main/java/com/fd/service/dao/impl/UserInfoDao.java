package com.fd.service.dao.impl;

import org.springframework.stereotype.Repository;

import com.fd.myshardingfordata.dao.base.impl.DaoShardingBase;
import com.fd.service.dao.IUserInfoDao;
import com.fd.service.domain.UserInfo;

@Repository
public class UserInfoDao extends DaoShardingBase<UserInfo> implements IUserInfoDao {

}
