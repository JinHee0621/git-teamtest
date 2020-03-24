package com.jh.parent;

public class Test extends Vihicle{
	private String name;
	public Test() {	}
	public Test(String name, String usage, int speed, int moveLength) {
		this.setUsage(usage);
		this.setSpeed(speed);
		this.setLength(moveLength);
		this.name = name;
		
	}
	
	@Override
	public void moving(int c) {
		System.out.println("오버라이딩 테스트");
	}
	
	
}
