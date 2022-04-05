package com.clarity;

import com.clarity.service.admin.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyblogApplicationTests {

    @Autowired
    AdminService adminService;

    @Test
    void contextLoads() {
        System.out.println(adminService.adminLogin("admin", "123456"));

    }

}
