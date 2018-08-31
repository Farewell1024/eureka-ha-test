package com.zhangyu.eurekahaprovider.controller;

import com.zhangyu.eurekahaprovider.model.OrderModel;
import org.springframework.boot.web.filter.OrderedRequestContextFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by zhangyu on 2018/8/31
 */
@RestController
public class OrderController {

    @GetMapping("/order/{id}")
    public OrderModel findOrderById(@PathVariable Long id){
        OrderModel orderModel = new OrderModel();
        orderModel.setOrderNo(id);
        orderModel.setCreateTime(new Date());
        orderModel.setPayTime(new Date());
        return orderModel;
    }

}
