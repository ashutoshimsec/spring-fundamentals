package com.ashu.spring.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class ApplicationContextUtils implements ApplicationContextAware{

	private static ApplicationContext applicationContext = null;
	
	

	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		ApplicationContextUtils.applicationContext = context;
		
	}
	
	
	
	public static Object getBean(String beanName) {
		
		if(applicationContext == null){
			applicationContext = new ClassPathXmlApplicationContext("SpringContext.xml");
		}
		System.out.println("comming for bean"+applicationContext);
	    return applicationContext.getBean(beanName);
	  }
	
}
