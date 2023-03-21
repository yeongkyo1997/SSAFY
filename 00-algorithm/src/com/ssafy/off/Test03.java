package com.ssafy.off;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("반복 : " + solve1(10));

		System.out.println("재귀 : " + solve2(10));
		System.out.println("재귀2 : " + solve3(1, 10, 0));
	}

	static int solve1(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++)
			sum += i;
		return sum;
	}

	static int solve2(int num) {
		if (num == 1)
			return 1;
		return num + solve2(num - 1);
	}

	static int solve3(int start, int num, int sum) {
		if (start > num)
			return sum;
		return solve3(start + 1, num, sum + start);
	}
}
