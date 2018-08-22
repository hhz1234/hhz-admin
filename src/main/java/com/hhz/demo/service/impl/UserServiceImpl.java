package com.hhz.demo.service.impl;

import com.hhz.demo.dao.mongo.DeptRepository;
import com.hhz.demo.dao.UserRepository;
import com.hhz.demo.entity.Dept;
import com.hhz.demo.entity.SysUser;
import com.hhz.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DeptRepository deptRepository;


    public List<SysUser> getUserList(){

        List<SysUser> allList = userRepository.findAll();
        return allList;
    }

    @RequestMapping("mongoData")
    public Object findMongoData(){
        List<Dept> all = deptRepository.findAll();

        return all;
    }

}
