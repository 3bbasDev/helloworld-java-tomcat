package com.abbe.helloworld.courses.contrller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        var course=new Course(1,"test","testing");
        return Arrays.asList(course);
    }
}
