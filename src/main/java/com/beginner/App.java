package com.beginner;

import com.beginner.entity.mapper.UserInfoMapper;
import com.beginner.entity.po.UserInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.beginner"})
//@EnableAutoConfiguration
@RestController
@MapperScan("com.beginner.entity.mapper")
public class App 
{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/")
    public String home(){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
        if(userInfo == null)
            return "用户不存在！";
        return  userInfo.getName() ;
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
