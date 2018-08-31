package com.zhangyu.eurekahaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaHaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHaProviderApplication.class, args);
	}
}
