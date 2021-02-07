/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2021/2/6
*/

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! quick 你好";
    }
}

