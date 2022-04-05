package com.clarity.service.admin.impl;

import com.clarity.mapper.AdminMapper;
import com.clarity.pojo.Admin;
import com.clarity.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//必须加这个service才能被spring发现
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin adminLogin(String username, String password) {
        System.out.println(username + password);
        return adminMapper.queryAdmin(username, password);
    }
}
