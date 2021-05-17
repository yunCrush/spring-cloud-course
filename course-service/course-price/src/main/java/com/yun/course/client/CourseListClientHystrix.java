package com.yun.course.client;

import com.yun.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 23:58
 * Description: 断路器实现类
 */
@Component
public class CourseListClientHystrix  implements  CourseListClient{
    @Override
    public List<Course> courseList() {
        List<Course> defaultCourseList = new ArrayList<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseId(1);
        course.setCourseName("默认课程");
        course.setValid(1);
        defaultCourseList.add(course);
        return defaultCourseList;
//  return Collections.emptyList()
    }
}
