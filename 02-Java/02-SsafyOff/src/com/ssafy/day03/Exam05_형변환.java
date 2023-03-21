package com.ssafy.day03;

class P {
}

class C extends P {
}

public class Exam05_형변환 {
	public static void main(String[] args) {
		P p = new P();
		C c = new C();

		P p1 = new C();

		// 객체변수 instanceof 타입 -> true or false
		// p instanceof P
		System.out.println(p instanceof P);
		System.out.println(p instanceof Object);
		System.out.println(p instanceof C);
	}
}
