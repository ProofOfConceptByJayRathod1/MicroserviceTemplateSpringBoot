package com.servicetwogroup.servicetwoartifact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceTwoEntity {

	//entities 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceTwoId;
	private String serviceTwoProp1;
	private String serviceTwoProp2;
	private String serviceTwoProp3;
	private long serviceOneId;
	@Override
	public String toString() {
		return "ServiceTwoEntity [serviceTwoId=" + serviceTwoId + ", serviceTwoProp1=" + serviceTwoProp1
				+ ", serviceTwoProp2=" + serviceTwoProp2 + ", serviceTwoProp3=" + serviceTwoProp3 + ", serviceOneId="
				+ serviceOneId + "]";
	}
	public long getServiceTwoId() {
		return serviceTwoId;
	}
	public void setServiceTwoId(long serviceTwoId) {
		this.serviceTwoId = serviceTwoId;
	}
	public String getServiceTwoProp1() {
		return serviceTwoProp1;
	}
	public void setServiceTwoProp1(String serviceTwoProp1) {
		this.serviceTwoProp1 = serviceTwoProp1;
	}
	public String getServiceTwoProp2() {
		return serviceTwoProp2;
	}
	public void setServiceTwoProp2(String serviceTwoProp2) {
		this.serviceTwoProp2 = serviceTwoProp2;
	}
	public String getServiceTwoProp3() {
		return serviceTwoProp3;
	}
	public void setServiceTwoProp3(String serviceTwoProp3) {
		this.serviceTwoProp3 = serviceTwoProp3;
	}
	public long getServiceOneId() {
		return serviceOneId;
	}
	public void setServiceOneId(long serviceOneId) {
		this.serviceOneId = serviceOneId;
	}
	public ServiceTwoEntity(long serviceTwoId, String serviceTwoProp1, String serviceTwoProp2, String serviceTwoProp3,
			long serviceOneId) {
		super();
		this.serviceTwoId = serviceTwoId;
		this.serviceTwoProp1 = serviceTwoProp1;
		this.serviceTwoProp2 = serviceTwoProp2;
		this.serviceTwoProp3 = serviceTwoProp3;
		this.serviceOneId = serviceOneId;
	}
	public ServiceTwoEntity() {
		super();
	}

	
	
	
	
	
}
