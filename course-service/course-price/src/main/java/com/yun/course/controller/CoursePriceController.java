package com.yun.course.controller;

import com.yun.course.client.CourseListClient;
import com.yun.course.dao.CoursePriceMapper;
import com.yun.course.entity.Course;
import com.yun.course.entity.CourseAndPrice;
import com.yun.course.entity.CoursePrice;
import com.yun.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 17:40
 * Description:
 */
@RestController
public class CoursePriceController {
    @Autowired
    CoursePriceService coursePriceService;
    @Autowired
    CourseListClient courseListClient;

    @GetMapping("/price")
    public Integer getCoursePrice(Integer courseId) {
        CoursePrice coursePrice = coursePriceService.getCoursePrice(courseId);
        return coursePrice.getPrice();
    }

//  远程调用course-list接口，Fegin组件
    @GetMapping("/coursesInPrice")
    public List<Course> getCourseListInPrice(Integer courseId) {
        List<Course> courseList =  courseListClient.courseList();
        return courseList;
    }

    @GetMapping("/courseAndPrice")
    public List<CourseAndPrice> getCourseAndPrice(){
        List<CourseAndPrice> courseAndPriceList = coursePriceService.getCourseAndPrice();
        return courseAndPriceList;
    }

}
