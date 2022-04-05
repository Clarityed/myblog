package com.clarity.mapper;

import com.clarity.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
//@Repository 按之前自己学的要加，由于服务层采用另一种风格，所以不加这个，但是对于服务接口的实现类就要增加一个注解@Service
public interface AdminMapper {

    /**
     * 根据用户名和密码获取用户信息
     * @param username
     * @param password
     * @return
     */
    Admin queryAdmin(@Param("username") String username, @Param("password") String password);
}
