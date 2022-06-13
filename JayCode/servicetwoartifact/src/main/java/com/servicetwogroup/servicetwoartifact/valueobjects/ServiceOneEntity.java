package com.servicetwogroup.servicetwoartifact.valueobjects;

public class ServiceOneEntity {

	
	private long serviceOneId;
	private String serviceOneProp1;
	private String serviceOneProp2;
	private String serviceOneProp3;
	@Override
	public String toString() {
		return "ServiceOneEntity [serviceOneId=" + serviceOneId + ", serviceOneProp1=" + serviceOneProp1
				+ ", serviceOneProp2=" + serviceOneProp2 + ", serviceOneProp3=" + serviceOneProp3 + "]";
	}
	public ServiceOneEntity(long serviceOneId, String serviceOneProp1, String serviceOneProp2, String serviceOneProp3) {
		super();
		this.serviceOneId = serviceOneId;
		this.serviceOneProp1 = serviceOneProp1;
		this.serviceOneProp2 = serviceOneProp2;
		this.serviceOneProp3 = serviceOneProp3;
	}
	public ServiceOneEntity() {
		super();
	}
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
