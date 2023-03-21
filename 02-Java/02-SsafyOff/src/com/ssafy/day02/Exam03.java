package com.ssafy.day02;

import java.util.Scanner;

/*
 * static 블럭
 * - 클래스 정보가 로딩될 때 실행
 * - 형태 : static {}
 * 
 */

class StaticSub {
	static int v = 100;

	StaticSub() {
		System.out.println("1. StaticSub 생성자 호출");
	}

	static {
		System.out.println("2. 클래스 정보가 로딩될 떄 실행");
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3. main start --------");
		StaticSub ss = new StaticSub();
		System.out.println("4. ss 객체 생성 후 메인 메서드");
	}
}
