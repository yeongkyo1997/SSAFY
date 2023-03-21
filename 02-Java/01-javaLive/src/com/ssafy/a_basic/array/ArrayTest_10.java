package com.ssafy.a_basic.array;

public class ArrayTest_10 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };

		// TODO: int로 구성된 배열에서 최대값과 최소값을 출력하시오.
		int max = intArray[0];
		int min = intArray[0];

		for (int i = 0; i < intArray.length; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
			if (min > intArray[i]) {
				min = intArray[i];
			}
		}

		// END:
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
