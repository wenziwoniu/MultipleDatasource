package com.test.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.Student;

@Service
public class DataTransferService {

	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@PersistenceContext(unitName="test")
	private EntityManager entityManager;
	
	@Transactional("tran1")
	public void getStudent() {
		
		System.out.println(jdbcUrl);
		
		Student student = entityManager.find(Student.class, 1L);
		student.setStudentName("wa1n");
		entityManager.merge(student);
		
		Student student2 = new Student();
		student2.setStudentName("xia");
		entityManager.persist(student2);
		System.out.println("test");
	}
}
