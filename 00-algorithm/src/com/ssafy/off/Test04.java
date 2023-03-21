package com.ssafy.off;

public class Test04 {
	public static void main(String[] args) {
		System.out.println(solve(new int[] { 1, 3, 5, 7, 9 }, 0));
	}

	private static int solve(int[] list, int depth) {
		if (depth == list.length - 1)
			return list[depth];
		return list[depth] + solve(list, depth + 1);
	}
}
