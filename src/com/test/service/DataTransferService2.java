package com.test.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.User;

@Service
public class DataTransferService2 {

	@PersistenceContext(unitName = "test2")
	private EntityManager entityManager;
	
	@Transactional("tran2")
	public void getUser() {
			User user = new User();
			user.setName("ni");
			entityManager.persist(user);
	}
}
