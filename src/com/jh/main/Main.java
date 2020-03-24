package com.jh.main;

import com.jh.parent.*;

public class Main {

	public static void main(String[] args) {
		Car user1 = new Car("김씨", "페라리 자동차", 120, 100);
		user1.moving(10);
		
		Suv beom = new Suv("구아방", 20, 20);
		beom.moving(60);
	}

}
