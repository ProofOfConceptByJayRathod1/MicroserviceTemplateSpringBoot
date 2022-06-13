package com.serviceonegroup.serviceoneartifact.serviceonepackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.serviceonegroup.serviceoneartifact.serviceonepackage.entity.ServiceOneEntity;
import com.serviceonegroup.serviceoneartifact.serviceonepackage.service.ServiceOneService;

@RestController
@RequestMapping("/serviceone")

public class ServiceOneController {

    private static final Logger log = LogManager.getLogger(ServiceOneController.class);
	@Autowired
	private ServiceOneService serviceOneService;
	
	@PostMapping("/")
	public ServiceOneEntity saveServiceOneData(@RequestBody ServiceOneEntity serviceOneEntity) {
		log.info("In saveServiceOneData method of ServiceOneController");
		return serviceOneService.saveServiceOneEntity(serviceOneEntity);
	}
	
	@GetMapping("/{id}")
	public ServiceOneEntity findServiceOneDataById(@PathVariable("id") Long serviceOneId) {
		log.info("In findServiceOneDataById method of ServiceOneController");
		return serviceOneService.findServiceOneEntityById(serviceOneId);
	}
	
	
}
