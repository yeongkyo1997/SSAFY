package com.ssafy.off;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("반복");
		solve1(10);
		System.out.println("재귀");
		solve2(10);
		System.out.println("재귀2");
		solve3(1, 10);
	}

	private static void solve3(int start, int num) {
		System.out.println(start);
		if (start >= num)
			return;
		solve3(start + 1, num);
	}

	private static void solve1(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

	private static void solve2(int num) {
		if (num < 1)
			return;

		solve2(num - 1);
		System.out.println(num);
	}
}
