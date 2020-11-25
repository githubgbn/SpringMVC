package com.springmvc.controller;

import com.springmvc.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:guobingnan
 * @date: 2020/11/24 10:47
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println("执行了");
        System.out.println("用户名:" + username);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了saveAccount");
        System.out.println(account);
        return "success";
    }
}
