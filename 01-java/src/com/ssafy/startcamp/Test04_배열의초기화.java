package com.ssafy.startcamp;

import java.util.Arrays;

public class Test04_배열의초기화 {
	static void print(int v) {
		System.out.println(v * v);
	}

	static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		{
			System.out.println("=============================");
			int[] a = { 1, 10, 100, 1000 };
			print(new int[] { 1, 10, 100, 1000 });

			print(10);
			System.out.println("=============================");
		}
		// 3가지 배열의 값 초기화 방법
		{
			int[] arr = new int[3];
			arr[0] = 10;
			arr[1] = 100;
			arr[2] = 1000;
			System.out.println(arr[0]);
		}

		{
			/*
			 * int[] arr = new int[3]; arr = {10, 100, 1000};
			 */

			int[] arr = { 10, 100, 1000 }; // 배열 선언 시에만 가능 즉, 만들어진 이후에는 사용 불가능한 문법
			System.out.println(arr[0]);
		}

		{
			int[] arr = new int[] { 10, 100, 1000 };
			arr = new int[] { 20, 200, 2000 };
			System.out.println(Arrays.toString(arr));
		}

		{
			int[][] a = new int[3][3];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}