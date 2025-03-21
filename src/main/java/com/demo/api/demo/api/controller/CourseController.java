package com.demo.api.demo.api.controller;

import com.demo.api.demo.api.dto.Course;
import com.demo.api.demo.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService courseService;
    @PostMapping(produces = "application/json", consumes = "application/json")
    private ResponseEntity<Course> addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @GetMapping(produces = "application/json")
    private ResponseEntity<List<Course>> getCourse(){
       List<Course> courses = courseService.getCourse();
       return new ResponseEntity<>(courses,HttpStatus.OK);


    }

}
