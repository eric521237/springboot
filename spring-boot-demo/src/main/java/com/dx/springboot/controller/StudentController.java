package com.dx.springboot.controller;

import com.dx.springboot.entity.Student;
import com.dx.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);


    @RequestMapping("/hello")
    public List<Student> getList(){
        logger.info("获取student集合");
        return studentService.getList();
    }

}
