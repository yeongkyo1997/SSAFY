package com.ssafy.a_basic.array;

public class ArrayTest_13 {
	public static void main(String[] args) {
		int[] intArray = { 1, 3, 4, 7, 8, 10, 12, 15, 16, 17, 18 };

		// TODO: 1~20까지의 숫자 중 intArray에서 사용되지 않은 숫자를 출력하세요.
		int[] count = new int[20];
		for (int i = 0; i < intArray.length; i++) {
			count[intArray[i] - 1]++;
		}
		
		// END:
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) {
				System.out.print(i + 1 + " ");
			}
		}
	}
}
