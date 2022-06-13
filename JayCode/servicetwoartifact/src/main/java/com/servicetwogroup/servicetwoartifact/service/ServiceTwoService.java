package com.servicetwogroup.servicetwoartifact.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.servicetwogroup.servicetwoartifact.controller.ServiceTwoController;
import com.servicetwogroup.servicetwoartifact.entity.ServiceTwoEntity;
import com.servicetwogroup.servicetwoartifact.repository.ServiceTwoRepository;
import com.servicetwogroup.servicetwoartifact.valueobjects.ResponseTemplateValueObjects;
import com.servicetwogroup.servicetwoartifact.valueobjects.ServiceOneEntity;

@Service
public class ServiceTwoService {
    private static final Logger log = LogManager.getLogger(ServiceTwoController.class);
	@Autowired
	private ServiceTwoRepository serviceTwoRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	
	public ServiceTwoEntity saveServiceTwoData(ServiceTwoEntity serviceTwoEntity) {
		// TODO Auto-generated method stub
		log.info("In saveServiceTwoData method of ServiceTwoService");
		return serviceTwoRepository.save(serviceTwoEntity);
	}

	public ResponseTemplateValueObjects getServiceTwoEntityWithServiceOneEntity(long serviceTwoId) {
		// TODO Auto-generated method stub
		log.info("In getServiceTwoEntityWithServiceOneEntity method of ServiceTwoService");
		ResponseTemplateValueObjects responseTemplateValueObjects=new ResponseTemplateValueObjects();
		ServiceTwoEntity serviceTwoEntity=serviceTwoRepository.findByServiceTwoId(serviceTwoId);
		ServiceOneEntity serviceOneEntity =restTemplate.getForObject("http://SERVICE-ONE-SERVICE/serviceone/" + serviceTwoEntity.getServiceOneId() , ServiceOneEntity.class);
		// as we have implemented service registry and named the service name in application.yml it is possible for us to write service name instead of localhost:9001 above.

		responseTemplateValueObjects.setServiceTwoEntity(serviceTwoEntity);
		responseTemplateValueObjects.setServiceOneEntity(serviceOneEntity);
		return responseTemplateValueObjects;
	}
	
}
