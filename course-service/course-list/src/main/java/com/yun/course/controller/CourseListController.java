package com.yun.course.controller;

import com.yun.course.entity.Course;
import com.yun.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 15:52
 */
@RestController
public class CourseListController {
    @Autowired
    CourseListService courseListService;
    @GetMapping("/courses")

    public List<Course> courseList(){

        return courseListService.getCourseList();
    }


}
