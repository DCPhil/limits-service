package com.javapoint.microservices.bean;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	//no-argument constructor
	protected LimitConfiguration() {
		
	}
	
	public int getMaximum() {
		return maximum;
	}
	
	public int getMinimum() {
		return minimum;
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	

}
