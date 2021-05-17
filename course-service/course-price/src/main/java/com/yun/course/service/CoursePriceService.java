package com.yun.course.service;

import com.yun.course.entity.CourseAndPrice;
import com.yun.course.entity.CoursePrice;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 17:42
 * Description:
 */
public interface CoursePriceService {
    CoursePrice getCoursePrice(Integer courseId);
    List<CourseAndPrice> getCourseAndPrice();
}
