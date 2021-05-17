package com.yun.course.dao;

import com.yun.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: Crush
 * @Date:2021/1/14 17:46
 * Description:
 */
@Mapper
@Repository
public interface CoursePriceMapper {
    @Select("select * from course_price where course_id = #{courseId}")
    CoursePrice findCoursePrice(Integer courseId);
}
