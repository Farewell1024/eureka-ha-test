package com.zhangyu.eurekahaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaHaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHaServer2Application.class, args);
	}
}
