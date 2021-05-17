package com.yun.course.service.impl;

import com.yun.course.dao.CourseMapper;
import com.yun.course.entity.Course;
import com.yun.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 16:07
 * Description:
 */
@Service
public class CourseListServiceImpl implements CourseListService {
    @Autowired
    CourseMapper courseMapper;
    @Override
    public List<Course> getCourseList() {
        return courseMapper.findValidCourses();
    }
}
