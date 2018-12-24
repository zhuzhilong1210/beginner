package com.beginner.service.impl;

import com.beginner.entity.mapper.UserInfoMapper;
import com.beginner.entity.po.UserInfo;
import com.beginner.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserById(Integer id) {
        return userInfoMapper.selectById(id);
        //return userInfoMapper.selectByPrimaryKey(id);
    }
}
