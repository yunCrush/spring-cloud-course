package com.yun.course.service.impl;

import com.yun.course.client.CourseListClient;
import com.yun.course.dao.CoursePriceMapper;
import com.yun.course.entity.Course;
import com.yun.course.entity.CourseAndPrice;
import com.yun.course.entity.CoursePrice;
import com.yun.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 17:44
 * Description:
 */
@Service
public class CoursePriceServiceImpl implements CoursePriceService {
    @Autowired
    CoursePriceMapper coursePriceMapper;
    @Autowired
    CourseListClient courseListClient;
    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }

    @Override
    public List<CourseAndPrice> getCourseAndPrice() {

        List<Course> courses = courseListClient.courseList();
        List<CourseAndPrice> courseAndPricesList = new ArrayList<>();
        for (Course course : courses) {
            if (course != null) {
                CoursePrice coursePrice = getCoursePrice(course.getCourseId());
                CourseAndPrice courseAndPrice= new CourseAndPrice();
                courseAndPrice.setPrice(coursePrice.getPrice());
                courseAndPrice.setCourseId(course.getCourseId());
                courseAndPrice.setId(course.getId());
                courseAndPrice.setName(course.getCourseName());
                courseAndPricesList.add(courseAndPrice);
            }
        }
        return courseAndPricesList;
    }
}
