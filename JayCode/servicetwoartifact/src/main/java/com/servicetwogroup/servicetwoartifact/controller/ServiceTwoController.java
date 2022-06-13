package com.servicetwogroup.servicetwoartifact.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicetwogroup.servicetwoartifact.entity.ServiceTwoEntity;
import com.servicetwogroup.servicetwoartifact.service.ServiceTwoService;
import com.servicetwogroup.servicetwoartifact.valueobjects.ResponseTemplateValueObjects;


@RestController
@RequestMapping("/servicetwo")
public class ServiceTwoController {
    private static final Logger log = LogManager.getLogger(ServiceTwoController.class);
	@Autowired
	private ServiceTwoService serviceTwoService;
	
	
	
	@PostMapping("/")
	public ServiceTwoEntity saveServiceTwoData(@RequestBody ServiceTwoEntity serviceTwoEntity) {
		log.info("In saveServiceTwoData method of ServiceTwoController");
		return serviceTwoService.saveServiceTwoData(serviceTwoEntity);
	}
	
	@GetMapping("/{serviceTwoId}")
	public ResponseTemplateValueObjects getServiceTwoEntityWithServiceOneEntity(@PathVariable("serviceTwoId") long serviceTwoId) {
		log.info("inside getServiceTwoEntityWithServiceOneEntity of ServiceTwoController");
		return serviceTwoService.getServiceTwoEntityWithServiceOneEntity(serviceTwoId);
	}
	
}


