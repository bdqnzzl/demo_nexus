package service;

import dao.UserMapper;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public User getUserTop1(){
      return userMapper.getUserTop1();
    }
}
