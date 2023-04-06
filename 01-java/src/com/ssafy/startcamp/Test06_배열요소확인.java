package com.ssafy.startcamp;

import java.util.Arrays;

public class Test06_배열요소확인 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		System.out.println("1.4 까지 주로 사용");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		System.out.println("1.5버전에 추가된 향상된 for");
		for (int v : arr) {
			System.out.println(v);
		}

		System.out.println();
		System.out.println("1.5버전에 추가된 Arrays.toString 활용");
		System.out.println(Arrays.toString(arr));

		System.out.println();
		System.out.println("1.8버전에 추가된 Arrays.stream을 활용한 배열 요소 확인");
		Arrays.stream(arr).forEach(System.out::println);

		int[][] arr2 = { { 1 }, { 2, 3 } };
		System.out.println(Arrays.deepToString(arr2));
	}
}
