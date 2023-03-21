package com.ssafy.c_inheritance.person;

public class Person {
	String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println("냠냠");
	}

	void jump() {
		System.out.println("폴짝");
	}

	void eat(String tool) {
		System.out.println(tool + "을 이용해서");
		System.out.println("냠냠");
	}
}
