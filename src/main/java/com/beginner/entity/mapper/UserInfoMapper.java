package com.beginner.entity.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.beginner.entity.po.UserInfo;

public interface UserInfoMapper extends BaseMapper<UserInfo> {
    //自定义方法
    int listCount();
}