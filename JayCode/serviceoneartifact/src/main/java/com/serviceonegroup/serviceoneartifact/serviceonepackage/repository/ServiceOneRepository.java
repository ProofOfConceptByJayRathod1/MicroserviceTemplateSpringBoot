package com.serviceonegroup.serviceoneartifact.serviceonepackage.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceonegroup.serviceoneartifact.serviceonepackage.entity.ServiceOneEntity;
import com.serviceonegroup.serviceoneartifact.serviceonepackage.service.ServiceOneService;

public interface ServiceOneRepository extends JpaRepository<ServiceOneEntity, Long>{

	ServiceOneEntity findByServiceOneId(Long serviceOneId);
//LogManager.getLogger(ServiceOneService.class).info("Inside ServiceOneRepository");

}
