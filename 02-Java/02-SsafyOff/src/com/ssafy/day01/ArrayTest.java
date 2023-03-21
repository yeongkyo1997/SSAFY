package com.ssafy.day01;

public class ArrayTest {
	static int N = 3;
	static int M = 3;

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		exam01(arr); // 행 우선 순회하기
		exam02(arr);
		exam03(arr);
		exam04(arr);
	}

	private static void exam04(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j + (M - 1 - 2 * j) * (i % 2)] + " ");
			}
			System.out.println();
		}
	}

	private static void exam03(int[][] arr) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	private static void exam02(int[][] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][M - 1 - j] + " ");
			}
			System.out.println();
		}
	}

	private static void exam01(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
