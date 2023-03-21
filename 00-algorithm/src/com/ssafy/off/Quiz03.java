package com.ssafy.off;

public class Quiz03 {
	public static void main(String[] args) {
		solve(10, "");
	}

	private static void solve(int depth, String str) {
		if (depth == 0) {
			System.out.println(str);
			return;
		}
		solve(depth - 1, str + "0");
		solve(depth - 1, str + "1");
	}
}
