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
	
	public void moving() {
		System.out.println(name+"��/�� "+ this.getUsage() + "�� ����Ͽ� " + (this.getSpeed() * this.getMoveLength()) + "��ŭ ��������.");
	}
	
}