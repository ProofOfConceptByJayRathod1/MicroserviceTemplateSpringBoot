package com.servicetwogroup.servicetwoartifact.valueobjects;

import com.servicetwogroup.servicetwoartifact.entity.ServiceTwoEntity;

public class ResponseTemplateValueObjects {
	
	private ServiceOneEntity serviceOneEntity;
	private ServiceTwoEntity serviceTwoEntity;
	@Override
	public String toString() {
		return "ResponseTemplateValueObjects [serviceOneEntity=" + serviceOneEntity + ", serviceTwoEntity="
				+ serviceTwoEntity + "]";
	}
	public ServiceOneEntity getServiceOneEntity() {
		return serviceOneEntity;
	}
	public void setServiceOneEntity(ServiceOneEntity serviceOneEntity) {
		this.serviceOneEntity = serviceOneEntity;
	}
	public ServiceTwoEntity getServiceTwoEntity() {
		return serviceTwoEntity;
	}
	public void setServiceTwoEntity(ServiceTwoEntity serviceTwoEntity) {
		this.serviceTwoEntity = serviceTwoEntity;
	}
	public ResponseTemplateValueObjects(ServiceOneEntity serviceOneEntity, ServiceTwoEntity serviceTwoEntity) {
		super();
		this.serviceOneEntity = serviceOneEntity;
		this.serviceTwoEntity = serviceTwoEntity;
	}
	public ResponseTemplateValueObjects() {
		super();
	}
	
}
