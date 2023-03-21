package com.ssafy.off;

public class Quiz02 {
	public static void main(String[] args) {
		System.out.println(solve(100, "")); // 1100100
	}

	private static String solve(int i, String string) {
		return i == 0 ? string : solve(i / 2, i % 2 + string);
	}
}
