package com.ssafy.hw.java_hw_04_2;

public class User {

	String id;
	String password;
	String name;
	String email;
	int age;

	// 기본 생성자
	public User() {
	}

	// 멤버 변수 초기화를 위해 인자를 받는 생성자
	public User(String id, String password, String name, String email, int age) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
	}

}
