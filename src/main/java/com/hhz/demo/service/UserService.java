package com.hhz.demo.service;

import com.hhz.demo.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<SysUser> getUserList();

    Object findMongoData();
}
