package com.jh.parent;

public class Bicycle extends Vihicle{
	private String name;
	
	public Bicycle() {}
	public Bicycle(String name, String usage,int speed, int moveLength) {
		this.name = name;
		this.setUsage(usage);
		this.setSpeed(speed);
		this.setLength(moveLength);
	}
	
	@Override
	public void moving(int a) {
		System.out.println("자전거를 탔다");
	}
}
