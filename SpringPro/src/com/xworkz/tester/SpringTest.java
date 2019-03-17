package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.Gym;

public class SpringTest {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resource/context.xml");
		Gym refOfGym=container.getBean(Gym.class);
		refOfGym.assignTrainer("madhu");
	}

}
