package com.ssafy.day02;

public class Dog {
	String name;
	int age;

	Dog() {
		this("무명", -1);
	}

	Dog(String name) {
		this(name, -1);
	}

	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
	}
}
