package com.fuze.websockets.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fuze.websockets.dao.entity.PORequest;
import com.fuze.websockets.dao.entity.PORequestHistory;


@Repository
public interface PORequestRepository extends JpaRepository<PORequest, Integer>{

	

}
