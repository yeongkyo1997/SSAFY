package com.ssafy.b_abstraction.person;

public class PersonTest {

	public static void main(String[] args) {
		// 객체 사용
		Person p = new Person();
		p.org = "SSAFY2";
		p.name = "홍길동";
		p.isHungry = true;
		p.eat();

		p.printInfo();

		Person p2 = new Person();
		p2.name = "장길산";
		p2.work();
		System.out.println(p2.org);
		p2.printInfo();
	}
}
