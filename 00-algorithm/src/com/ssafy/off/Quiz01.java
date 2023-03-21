package com.ssafy.off;

public class Quiz01 {
	public static void main(String[] args) {
		System.out.println(solve("korea", 0)); // k,o,r,e,a
	}

	private static String solve(String string, int num) {
		return num == string.length() ? "" : string.charAt(num) + "," + solve(string, num + 1);
	}
}
