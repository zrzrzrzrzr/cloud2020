package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zhangruic
 * CreateDate: 2022/2/26 17:46
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        System.out.println("hello git2!");
        System.out.println("hello git3!");
        System.out.println("hello master");
        System.out.println("hello hot-fix");
        System.out.println("hello push");
        return paymentDao.getPaymentById(id);
    }
}
