package com.beginner.controller;

import com.beginner.entity.po.UserInfo;
import com.beginner.service.IUserService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class UserControllerTest extends ApplicationTest {
    @Resource
    private IUserService iUserService;

    @Test
    public void testUser() {
        String s = "{\"aac001\":\"0511775582\",\"aaz301\":\"330681201706055023558\",\"result\":\"0\"}";

        UserInfo userInfo = iUserService.getUserById(1);
        Assert.assertTrue(userInfo != null);
        System.out.println(userInfo.getName());
        System.out.println(s);
    }

}