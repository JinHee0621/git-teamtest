package com.jh.parent;

public class Car extends Vihicle{
	private String name;
	
	public Car() {}
	public Car(String name, String usage,int speed, int moveLength) {
		this.name = name;
		this.setUsage(usage);
		this.setSpeed(speed);
		this.setLength(moveLength);
	}
	
	@Override
	public void moving(int b) {
		System.out.println(name+"은/는 "+ this.getUsage() + "를 사용하여 " 
	+ (this.getSpeed() * this.getMoveLength()) + "만큼 움직였다.");
		
	}
	
}