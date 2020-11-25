package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author:guobingnan
 * @date: 2020/11/25 10:02
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * RequestParam 注解
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name="uname") String username){
        System.out.println(username);
        return "success";
    }

    /**
     * RequestBody 注解
     * @param body
     * @return
     */
    @RequestMapping(value = "/testRequestBody",produces = "application/json; charset=utf-8")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    /**
     * RequestBody 注解
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println(id);
        return "success";
    }

    /**
     * RequestHeader 注解
     * @param header
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Referer") String header){
        System.out.println(header);
        return "success";
    }
}
