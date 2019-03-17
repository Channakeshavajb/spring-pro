package com.xworkz.spring.util;

import org.springframework.context.ApplicationContext;

import com.xworkz.spring.bean.Bulb;

public class BulbTest {

	public static void main(String[] args) {
		ApplicationContext container=AppUtil.getSpringContainer("resource/context.xml");
		Bulb bb=container.getBean(Bulb.class);
	}

}
