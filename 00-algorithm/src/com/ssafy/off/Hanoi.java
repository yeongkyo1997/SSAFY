package com.ssafy.off;

public class Hanoi {
	public static void main(String[] args) {
		hanoi(9, "A", "C", "B");
	}

	static void hanoi(int N, String start, String end, String sub) {
		if (N == 1) {
			move(1, start, end);
			return;
		} else {
			hanoi(N - 1, start, sub, end);
			move(N, start, end);
			hanoi(N - 1, sub, end, start);
		}
	}

	static void move(int N, String start, String end) {
		System.out.println(N + "번 원반을 " + start + "에서" + end + "로 이동");
	}
}
