package com.ssafy.day03;

import java.util.Random;

class MyRandom extends Random {
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound - 1) + 1;
	}
}

public class Exam04_Final연습2 {
	public static void main(String[] args) {
		Random r = new MyRandom();
		int num = r.nextInt(10) + 1;
		System.out.println(num);
	}
}
