package com.jh.main;

import com.jh.parent.*;

public class Main {

	public static void main(String[] args) {
		Car user1 = new Car("�达", "��� �ڵ���", 120, 100);
		user1.moving(1);
		Bicycle user2 = new Bicycle("�־�", "���������", 60, 500);
		user2.moving(10);
	}

}
