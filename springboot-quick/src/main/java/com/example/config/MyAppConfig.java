package com.example.config;


import com.example.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孟享广
 * @date 2020-12-03 10:47 上午
 * @description
 */
@Configuration //指明此类是配置类
public class MyAppConfig {

    @Bean //将方法的返回值添加到容器中：默认id就是方法名
    public HelloService helloService() {
        System.out.println("推荐使用配置类给容器中加组件");
        return new HelloService();
    }
}
