package com.yun.course.client;

import com.yun.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 21:20
 * Description: 课程列表的Feign客户端
 */
@FeignClient(value = "course-list",fallback = CourseListClientHystrix.class)
@Primary
public interface CourseListClient {
    @GetMapping("/courses")
    List<Course> courseList();
}
