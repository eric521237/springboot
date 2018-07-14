package com.dx.springboot.service;

import com.dx.springboot.entity.User;
import com.dx.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public User add(User user){
        userMapper.add(user);
        return findById(user.getId());
    }

    public User findById(int id){
        User u = new User();
        u.setId(id);
        return userMapper.findOne(u);
    }

    public User findByName(String name){
        User u = new User();
        u.setName(name);
        return userMapper.findOne(u);
    }
}
