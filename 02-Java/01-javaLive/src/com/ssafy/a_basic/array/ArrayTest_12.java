package com.ssafy.a_basic.array;

public class ArrayTest_12 {
	public static void main(String[] args) {
		int[] intArray = { 3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3 };

		// TODO: 각 숫자가 몇 번 사용 되었는지 숫자별로 사용 횟수를 출력 하세요.
		// 사용 안된 숫자는 0으로 출력 한다
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
		int[] count = new int[max - min + 1];
		for (int i = 0; i < intArray.length; i++) {
			count[intArray[i] - min]++;
		}
		
		// END:
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + min + " : " + count[i]);
		}
	}
}
