package com.xworkz.spring.bean;

public class Wallet {
	
	private String origin;
	private int lifeSpan;
	
	public Wallet() {
		System.out.println("created.....\t"+this.getClass().getSimpleName());
	}

	public void setOrigin(String origin) {
		System.out.println("invoked setOrigin");
		this.origin = origin;
	}
	
	public void setLifeSpan(int lifeSpan) {
		System.out.println("ivoked setLifeSpan");
		this.lifeSpan = lifeSpan;
	}
	
	public void canBeSold(String countryName) {
		System.out.println("invoked canBeSold(...)\t");
		if(countryName!=null)
		System.out.println("can be sold in\t"+countryName);
	}
}
