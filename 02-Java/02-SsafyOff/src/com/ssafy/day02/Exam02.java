/*
 * 생성자
 * 
 * - 생성자가 호출되는 시점은?? -> 객체가 생성될 때
 * - 일반 메서드(인스턴스 메서드)와 차이점
 *  : 일반 메서드는 객체가 생성된 이후에 호출된다.
 * 
 * 타입a = new 타입();
 * 
 * - 생성자의 특징
 *   1. 이름이 클래스와 동일하다.
 *   2. 반환타입이 없다.(void가 아님)
 *   3. 생성자는 오버 로딩을 지원한다.
 */
package com.ssafy.day02;

public class Exam02 {
	public static void main(String[] args) {
		Dog d1 = new Dog("쪼");
		Dog d2 = new Dog("매", 3);
		System.out.println(d1);
		System.out.println(d2);
	}
}
