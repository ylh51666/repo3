package com.controller;

import com.model.bean.Course;
import com.model.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Course> getAll(){
        return  courseService.getAll();
    }

}
