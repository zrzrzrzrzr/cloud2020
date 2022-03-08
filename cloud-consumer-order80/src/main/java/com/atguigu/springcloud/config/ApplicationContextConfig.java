package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhangruic
 * CreateDate: 2022/3/8 21:32
 */
@Configuration
public class ApplicationContextConfig {
    @Bean//将RestTemplate交给IOC容器管理
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
