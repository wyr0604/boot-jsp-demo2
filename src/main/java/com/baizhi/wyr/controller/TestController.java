package com.baizhi.wyr.controller;

import com.baizhi.wyr.entity.TestUser;
import com.baizhi.wyr.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestUserService ts;
    @RequestMapping(value="/test1")
    public String test1(){
        return "阿很么";
    }
    @RequestMapping(value="/ShowAll")
    public List<TestUser> showAll(){
        List<TestUser> userList = ts.queryAll();
        return userList;
    }
}
