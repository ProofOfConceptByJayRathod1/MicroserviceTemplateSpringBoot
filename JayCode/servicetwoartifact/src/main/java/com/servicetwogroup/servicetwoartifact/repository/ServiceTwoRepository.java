package com.servicetwogroup.servicetwoartifact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicetwogroup.servicetwoartifact.entity.ServiceTwoEntity;

@Repository
public interface ServiceTwoRepository extends JpaRepository<ServiceTwoEntity,  Long>{

 ServiceTwoEntity findByServiceTwoId(Long serviceTwoId);

}
