package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.test.service.DataTransferService;
import com.test.service.DataTransferService2;

@Controller
public class DataTransefer {
	
	/**
	 * 功能 :
	 * 开发：zwwang 2016-5-19 上午11:46:34
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springServlet.xml");
		
		DataTransferService transferService = context.getBean(DataTransferService.class);
		
		transferService.getStudent();
		
		DataTransferService2 transferService2 = context.getBean(DataTransferService2.class);
		
		transferService2.getUser();
		
	}

}
