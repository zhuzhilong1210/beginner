package com.beginner;

import com.beginner.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/miaosha")
public class MiaoshaController extends BaseController {

    @RequestMapping("/hello")
    public void Hello(){
        System.out.println("hello hello");
    }
}
