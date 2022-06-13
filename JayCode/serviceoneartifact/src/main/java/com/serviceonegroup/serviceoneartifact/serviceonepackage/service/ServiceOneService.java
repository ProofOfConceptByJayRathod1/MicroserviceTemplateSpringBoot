package com.serviceonegroup.serviceoneartifact.serviceonepackage.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.serviceonegroup.serviceoneartifact.serviceonepackage.entity.ServiceOneEntity;
import com.serviceonegroup.serviceoneartifact.serviceonepackage.repository.ServiceOneRepository;

@Service
public class ServiceOneService {

    private static final Logger log = LogManager.getLogger(ServiceOneService.class);
	@Autowired
	private ServiceOneRepository serviceOneRepository;
	

	public ServiceOneEntity saveServiceOneEntity(@RequestBody ServiceOneEntity serviceOneEntity) {
		// TODO Auto-generated method stub
		log.info("inside saveServiceOneEntity method of ServiceOneService class.");
		return serviceOneRepository.save(serviceOneEntity);
	}


	public ServiceOneEntity findServiceOneEntityById(Long serviceOneId) {
		
		// TODO Auto-generated method stub
		log.info("inside findServiceOneEntityById method of ServiceOneService class.");

		return serviceOneRepository.findByServiceOneId(serviceOneId);
	}


	
}
