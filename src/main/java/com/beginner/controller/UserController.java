package com.beginner.controller;

import com.beginner.controller.BaseController;
import com.beginner.entity.po.UserInfo;
import com.beginner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/get")
    @ResponseBody
    public UserInfo getUser(Integer id) {
        UserInfo userInfo = iUserService.getUserById(id);
        return userInfo;
    }

    @RequestMapping("/hello")
    public String Hello() {
        return "hello hello";
    }
}
