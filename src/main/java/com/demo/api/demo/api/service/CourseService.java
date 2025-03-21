package com.demo.api.demo.api.service;

import com.demo.api.demo.api.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<Course> myCourseList = new ArrayList<>();
    public void addCourse(Course course) {
        myCourseList.add(course);
    }

    public List<Course> getCourse() {
        return myCourseList;
    }
}
