package com.yun.course.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Crush
 * @Date:2021/1/14 15:53
 *
 */
@Data
public class Course  implements Serializable {
    Integer id;
    Integer courseId;
    String courseName;
    Integer valid;
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", valid=" + valid +
                '}';
    }
}
