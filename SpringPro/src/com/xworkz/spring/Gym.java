package com.xworkz.spring;

public class Gym {
	
	private double fees;
	private String trainer;
	
	public Gym(double fees,String trainer ) {
		System .out.println("created\t"+this.getClass().getSimpleName());
		System.out.println("with param="+2);
		this.fees=fees;
		this.trainer=trainer;
	}
	
	public void assignTrainer(String member) {
		System.out.println("assign trainer for\t"+member);
		if(fees>10) {
			System.out.println("trainer assigned is :\t"+this.trainer);
			return;
		}
		System.out.println("trainer will not be assigned as fees is less than 10, pay first otherwise dont come");
	}

}
