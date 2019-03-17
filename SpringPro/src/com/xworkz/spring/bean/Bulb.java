package com.xworkz.spring.bean;

public class Bulb {
	
	private int watts;
	private String ofType;
	private boolean working;
	
	public Bulb() {
		// TODO Auto-generated constructor stub
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}
	
	public Bulb(int watts,boolean working) {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
		this.watts=watts;
		this.working=working;
		System.out.println("watts of bulb is\t"+watts);
	}

	public Bulb(boolean working) {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
		this.working=working;
		System.out.println("working of bulb is\t"+watts);
	}
	
	public void setOfType(String ofType) {
		this.ofType = ofType;
		System.out.println("type  of bulb is\t"+ofType);
	}
}
