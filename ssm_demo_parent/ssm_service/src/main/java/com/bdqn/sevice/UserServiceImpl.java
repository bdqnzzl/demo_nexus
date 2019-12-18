package com.bdqn.sevice;

import com.bdqn.dao.UserDaoImpl;
import com.bdqn.dao.UserMapper;
import com.bdqn.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl {
    @Resource
    private UserMapper userMapper;


    public User method1(){

        return userMapper.method1();
    }
}
