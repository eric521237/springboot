package com.dx.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.dx.springboot.entity.User;
import com.dx.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public Object add(@RequestBody User user){
        if(userService.findByName(user.getName()) != null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "用户已使用");
            return jsonObject;
        }

        return userService.add(user);
    }
}
