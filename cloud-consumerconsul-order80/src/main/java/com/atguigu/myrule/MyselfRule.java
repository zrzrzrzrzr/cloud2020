package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhangruic
 * CreateDate: 2022/3/12 15:27
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }

}
