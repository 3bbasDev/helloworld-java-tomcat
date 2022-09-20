package com.testtomcat.demo.courses.contrller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testtomcat.demo.courses.Course;

@RestController
public class HelloworldApplication {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        var course=new Course(1,"test","testing");
        return Arrays.asList(course);
    }
}
