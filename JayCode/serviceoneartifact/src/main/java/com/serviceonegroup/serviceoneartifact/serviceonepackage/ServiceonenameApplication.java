package com.serviceonegroup.serviceoneartifact.serviceonepackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceonenameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceonenameApplication.class, args);
	}

}
