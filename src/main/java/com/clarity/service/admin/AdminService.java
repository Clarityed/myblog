package com.clarity.service.admin;

import com.clarity.pojo.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    /**
     * 管理员登入后台
     * @param username
     * @param password
     * @return
     */
    Admin adminLogin(String username, String password);
}
