package com.ashu.spring.wirings;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ashu.spring.beans.Users;
import com.ashu.spring.beans.Welcome;
import com.ashu.spring.utils.ApplicationContextUtils;



public class Test {

	@Autowired
	Welcome w;
	

	
	public static void main(String[] args) throws Exception {

	
		ApplicationContextUtils au = new ApplicationContextUtils();
		System.out.println(au.getBean("amit").toString());
		
	Test t=new Test();
	
	
	}

}
