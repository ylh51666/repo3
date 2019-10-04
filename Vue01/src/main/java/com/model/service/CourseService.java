package com.model.service;


import com.model.bean.Course;
import com.model.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getAll(){
        return  courseMapper.getAll();
    }

}
