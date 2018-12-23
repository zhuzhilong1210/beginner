package com.beginner.controller;

import com.beginner.base.BaseController;
import com.beginner.entity.po.UserInfo;
import com.beginner.exception.BaseException;
import com.beginner.exception.EnumErrMsg;
import com.beginner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/userInfo")
    public ResponseEntity getUser(Integer id) throws BaseException {
        UserInfo userInfo = iUserService.getUserById(id);

        if (userInfo == null) {
            //throw new BaseException(EnumErrMsg.DB_EXCEPTION);
            throw new BaseException(EnumErrMsg.DB_EXCEPTION, "当前用户未找到");
        }
        //int i = 100/0;
        return this.response(userInfo);
        //return JSONObject.toJSON(userInfo).toString();
    }

    @RequestMapping("/hello")
    public String Hello() {
        return "hello hello";
    }
}
