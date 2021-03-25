package com.cjs.controller;

import com.cjs.domain.Account;
import com.cjs.service.HelloService;
import com.cjs.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:cjs
 * @Description:
 * @Date:Created in 9:40 2020/10/17
 * @Modified by:
 */

@Controller
public class HelloController {

    @Autowired
    HelloServiceImpl helloService;


    @RequestMapping("/toIndex")
    public String toIndex(){

        return "index";
    }


    @RequestMapping("/hello")
    public String Hello(){
        List<Account> list = helloService.queryAll();
        for (Account account : list) {
            System.out.println(account);
            System.out.println("测试github");
        }
        System.out.println("controller中");
        return "suc";
    }
}
