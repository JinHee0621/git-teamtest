package com.jh.parent;

public class Suv extends Vihicle {
	
	public Suv() {}

	public Suv(String a, int b, int c) {
		this.setUsage(a);
		this.setSpeed(b);
		this.setLength(c);
		
	}
	
	@Override
	public void moving(int a) {
		System.out.println(this.getUsage() + "�� " + (a * this.getMoveLength()) + "��ŭ �����δ�.");
	}
}
