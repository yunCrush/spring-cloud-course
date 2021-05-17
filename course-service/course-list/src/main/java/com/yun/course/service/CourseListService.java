package com.yun.course.service;

import com.yun.course.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 16:04
 * Description:
 */


public interface CourseListService {
    List<Course> getCourseList();
}
