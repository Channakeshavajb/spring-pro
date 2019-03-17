package com.xworkz.spring.util;

import org.springframework.context.ApplicationContext;

import com.xworkz.spring.bean.Wallet;

public class WalletTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container=AppUtil.getSpringContainer("resource/context.xml");
		Wallet wlt=container.getBean(Wallet.class);
		wlt.canBeSold("india");
	}

}
