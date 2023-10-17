package com.trip.user.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trip.user.server.mapper.UserInfoMapper;
import com.trip.user.server.service.UserInfoService;
import com.trip.user.domian.UserInfo;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
}
