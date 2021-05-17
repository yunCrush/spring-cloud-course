package com.yun.course.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Crush
 * @Date:2021/1/14 17:42
 * Description:
 */
@Data
public class CoursePrice  implements Serializable {
    Integer id;
    Integer courseId;
    Integer price;

    @Override
    public String toString() {
        return "CoursePrice{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", price=" + price +
                '}';
    }
}
