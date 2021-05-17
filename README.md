# spring-cloud-course

学习SpringCloud的Eureka、ribbon、feign、Zuul、hystrix组件

1. courselist服务：localhost:8081/course
        
2. courseprice服务：localhost:8082/price?courseId=362
　　　Feign调用courselist接口   localhost:8082/courseInPrice
   
3. coursezuul服务：
　　　请求courselist接口    localhost:9000/yun/list/course　　请求courseprice接口    localhost:9000/yun/price/course
4. eurekaserver服务：
　　　注册中心　localhost:8000 
