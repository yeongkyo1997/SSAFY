package com.ssafy.b_abstraction.person;

public class Person {
	static String org = "SSAFY";
	// 속성
	String name;
	int age;
	boolean isHungry;

	// 동작
	void work() {
		isHungry = true;
	}

	void eat() {
		isHungry = false;
	}

	void printInfo() {
		System.out.println(name + " : " + age + " : " + isHungry);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
