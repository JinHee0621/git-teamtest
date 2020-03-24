package com.jh.parent;

public class Vihicle {
	private String usage;
	private int speed;
	private int moveLength;
	
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setLength(int moveLength) {
		this.moveLength = moveLength;
	}
	
	public String getUsage() {
		return usage;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getMoveLength() {
		return moveLength;
	}
	
	public void moving(int a) {
		System.out.println("움직였다.");
		
	}
}


