package com.jh.parent;

public class Hojeong extends Vihicle{

	private String name;

	public Hojeong() {}
	public Hojeong(String name, String usage, int speed, int moveLength) {
		this.name = name;
		this.setUsage(usage);
		this.setSpeed(speed);
		this.setLength(moveLength);
	}
	
	@Override
	public void moving(int a) {
		System.out.println("name : " + name);
		System.out.println("usage : " + this.getUsage());
		System.out.println("speed : " + this.getSpeed());
		System.out.println("length : " + this.getMoveLength());
		System.out.println("a : " + a);
	}
	
}
//¿Ã»£¡§

//§ª§ª§ª