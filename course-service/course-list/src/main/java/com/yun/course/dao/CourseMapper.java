package com.yun.course.dao;

import com.yun.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Crush
 * @Date:2021/1/14 16:19
 * Description:
 */
@Mapper
@Repository
public interface CourseMapper {
    @Select("select * from course where valid = 1")
    List<Course> findValidCourses();
}
