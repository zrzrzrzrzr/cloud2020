package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: zhangruic
 * CreateDate: 2022/3/20 12:11
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
