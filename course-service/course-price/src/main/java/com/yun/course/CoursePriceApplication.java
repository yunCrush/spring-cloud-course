package com.yun.course;

import com.yun.course.entity.CoursePrice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.jar.Manifest;

/**
 * @Author: Crush
 * @Date:2021/1/14 18:44
 * Description:
 */
@SpringBootApplication
@EnableFeignClients
// 断路器注解
@EnableCircuitBreaker
public class CoursePriceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoursePriceApplication.class,args);
    }
}
