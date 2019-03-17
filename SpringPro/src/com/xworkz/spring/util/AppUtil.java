package com.xworkz.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppUtil {

	public static ApplicationContext getSpringContainer(String xmlFileLocation) {
		if (xmlFileLocation != null && !xmlFileLocation.isEmpty())
			return new ClassPathXmlApplicationContext(xmlFileLocation);
		throw new IllegalArgumentException("xml file location is not found");
	}

}
