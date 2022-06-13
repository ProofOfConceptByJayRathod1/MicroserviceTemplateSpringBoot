package com.servicetwogroup.servicetwoartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



/**
 * Service two service is calling service one service using resttemplate class' object. serviceoneid's data with servicetwoid will be rendered.
 */

@SpringBootApplication
@EnableEurekaClient
public class ServicetwoartifactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicetwoartifactApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

}
