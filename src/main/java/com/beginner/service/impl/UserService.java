package com.beginner.service.impl;

import com.beginner.entity.mapper.UserInfoMapper;
import com.beginner.entity.po.UserInfo;
import com.beginner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserById(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
