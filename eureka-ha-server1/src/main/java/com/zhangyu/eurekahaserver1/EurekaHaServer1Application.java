package com.zhangyu.eurekahaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaHaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHaServer1Application.class, args);
	}
}
