/*
 * 오버로딩 vs 오버라이딩(재정의 - 상속관계)
 * 
 * 객체지향의 특징 : 다형성
 * 
 * 이름은 동일한데 하는 일이 다르다.
 * 
 * 오버로딩
 * - 메서드 이름이 같다
 * - 매개변수의 개수 또는 타입이 달라야 한다.
 * 
 * - 반환타입은 상관없음
 */

package com.ssafy.day02;

public class Exam01 {
	static void printArray(int[] arr) {
		printArray(arr, 0, arr.length);
	}

	static void printArray(int[] arr, int begin) {
		printArray(arr, begin, arr.length);
	}

	static void printArray(int[] arr, int begin, int end) {
		for (int i = begin; i < end; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int season = 10;
		String result = "";
		switch (season) {
			case 12:
			case 1:
			case 2:
				result = "겨울";
				break;

			case 3:
			case 4:
			case 5:
				result = "봄";
				break;

			case 6:
			case 7:
			case 8:
				result = "여름";
				break;

			case 9:
			case 10:
			case 11:
				result = "가을";
				break;
		}

		System.out.println(season + "월은 " + result + "입니다.");

		printArray(new int[] { 1, 10, 100 });
		System.out.println();

		printArray(new int[] { 1, 10, 100 }, 2);
		System.out.println();

		printArray(new int[] { 1, 10, 100 }, 0, 2);
	}
}
