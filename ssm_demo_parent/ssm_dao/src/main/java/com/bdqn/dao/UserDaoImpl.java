package com.bdqn.dao;

import com.bdqn.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl {
    public User method1(){
        User user = new User();
        user.setPassword("12321");
        user.setUserName("lisi");
        return user;
    }
}
