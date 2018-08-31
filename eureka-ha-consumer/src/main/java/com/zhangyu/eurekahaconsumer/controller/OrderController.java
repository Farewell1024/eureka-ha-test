package com.zhangyu.eurekahaconsumer.controller;

import com.zhangyu.eurekahaconsumer.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangyu on 2018/8/31
 */
@RestController
public class OrderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    public String serviceUrl(){
        List<ServiceInstance> list = discoveryClient.getInstances("eureka-ha-provider");
        if (list.size()>0 && list!=null)
            return String.valueOf(list.get(0).getUri());
        return null;
    }

    @GetMapping("/consumer/{id}")
    public OrderModel getOrderInfo(@PathVariable Long id){
        String providerServiceUrl = serviceUrl();
        return this.restTemplate.getForObject(providerServiceUrl+"/order/"+id, OrderModel.class);

    }

}
