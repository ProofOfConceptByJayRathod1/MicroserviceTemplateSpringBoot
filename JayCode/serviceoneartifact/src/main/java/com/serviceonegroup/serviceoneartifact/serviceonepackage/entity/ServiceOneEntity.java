package com.serviceonegroup.serviceoneartifact.serviceonepackage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceOneEntity {

	//entities 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceOneId;
	private String serviceOneProp1;
	private String serviceOneProp2;
	private String serviceOneProp3;
	//toString 
	@Override
	public String toString() {
		return "ServiceOneEntity [serviceOneId=" + serviceOneId + ", serviceOneProp1=" + serviceOneProp1
				+ ", serviceOneProp2=" + serviceOneProp2 + ", serviceOneProp3=" + serviceOneProp3 + "]";
	}
	//toString with inherited methods
	public String toStringWithInheritedMethods() {
		return "ServiceOneEntity [serviceOneId=" + serviceOneId + ", serviceOneProp1=" + serviceOneProp1
				+ ", serviceOneProp2=" + serviceOneProp2 + ", serviceOneProp3=" + serviceOneProp3 + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	//parameterized constructor
	public ServiceOneEntity(long serviceOneId, String serviceOneProp1, String serviceOneProp2, String serviceOneProp3) {
		super();
		this.serviceOneId = serviceOneId;
		this.serviceOneProp1 = serviceOneProp1;
		this.serviceOneProp2 = serviceOneProp2;
		this.serviceOneProp3 = serviceOneProp3;
	}
	
	//default constructor
	public ServiceOneEntity() {
		super();
	}
	//getter setters
	public long getServiceOneId() {
		return serviceOneId;
	}
	public void setServiceOneId(long serviceOneId) {
		this.serviceOneId = serviceOneId;
	}
	public String getServiceOneProp1() {
		return serviceOneProp1;
	}
	public void setServiceOneProp1(String serviceOneProp1) {
		this.serviceOneProp1 = serviceOneProp1;
	}
	public String getServiceOneProp2() {
		return serviceOneProp2;
	}
	public void setServiceOneProp2(String serviceOneProp2) {
		this.serviceOneProp2 = serviceOneProp2;
	}
	public String getServiceOneProp3() {
		return serviceOneProp3;
	}
	public void setServiceOneProp3(String serviceOneProp3) {
		this.serviceOneProp3 = serviceOneProp3;
	}
	

	


}
