package com.dx.springboot.mapper;

import com.dx.springboot.entity.User;

public interface UserMapper {

    int add(User user);

    User findOne(User user);

}
