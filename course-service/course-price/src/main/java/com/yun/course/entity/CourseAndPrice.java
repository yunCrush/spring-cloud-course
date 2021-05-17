package com.yun.course.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Crush
 * @Date:2021/1/15 11:38
 * Description: 课程与价格的融合类
 */
@Data
public class CourseAndPrice  implements Serializable {
    Integer id;
    Integer courseId;
    String name;
    Integer price;
}
