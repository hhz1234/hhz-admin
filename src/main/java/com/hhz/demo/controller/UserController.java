package com.hhz.demo.controller;

import com.hhz.demo.entity.SysUser;
import com.hhz.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "userList",method = RequestMethod.GET)
    public Object getUserList(){

        List<SysUser> userList = userService.getUserList();

        return userList;
    }


}
