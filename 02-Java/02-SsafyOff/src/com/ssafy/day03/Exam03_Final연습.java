package com.ssafy.day03;

interface A {
	final String SERVER_IP = "192.168.0.1";

	void print();
}

/* final */ class Parent {
	public void call() {

	}
}

class Child extends Parent implements A {
	// The blank final field val may not have been initialized
	final int val;

	Child(int val) {
		this.val = val;
	}

	public void call() {
		System.out.println("재정의된 메서드");
	}

	@Override
	public void print() {
		// The final field A.SERVER_IP cannot be assigned
		// A.SERVER_IP = "10";
		System.out.println(A.SERVER_IP);
	}

}

// 접근제한자 : public, default package
// 활용관련 : final, abstract
public class Exam03_Final연습 {
	public static void main(String[] args) {
		call();
	}

	// 접근제한자 : 4가지 (public, protected, private, default)
	class Inner {
	}

	/*
	 * 접근제한자 : 4가지 (public, protected, private, default)
	 * 
	 * 활용제한자 : final, abstract, static, synchor
	 */
	private static void call() {
		System.out.println("call");
	}
}
