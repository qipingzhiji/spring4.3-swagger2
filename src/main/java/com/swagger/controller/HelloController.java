package com.swagger.controller;

import com.swagger.dao.TeacherMapper;
import com.swagger.entity.teacher.Teacher;
import com.swagger.entity.teacher.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TeacherMapper teacherDao;

    @GetMapping("/teachers")
    public Object listAllTeachers(){
        TeacherExample teacherExample = new TeacherExample();
        List<Teacher> teachers = teacherDao.selectByExample(teacherExample);
        return teachers;
    }
}
