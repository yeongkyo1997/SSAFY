package com.ssafy.startcamp;

import java.util.Arrays;
import java.util.Random;

public class Test07_로또 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(lotto1()));
		System.out.println(Arrays.toString(lotto3()));
		System.out.println(Arrays.toString(lotto4()));
	}

	static int[] lotto1() {
		final int lottoSize = 45;
		boolean[] used = new boolean[lottoSize + 1];
		Random r = new Random();

		r.setSeed(System.currentTimeMillis());
		int[] lotto = new int[6];
		lotto[0] = r.nextInt(lottoSize) + 1;
		used[lotto[0]] = true;

		for (int i = 1; i < lotto.length; i++) {
			int num = r.nextInt(lottoSize) + 1;
			if (used[num]) {
				i--;
				continue;
			} else
				used[num] = true;

			lotto[i] = num;
		}
		return lotto;
	}

	static int[] lotto3() {
		Random r = new Random();
		int[] lotto = new int[6];
		int[] numbers = new int[46];

		for (int i = 1; i < numbers.length; i++) {
			numbers[i] = i;
		}

		for (int i = 0; i < 1000; i++) {
			int num = r.nextInt(45) + 1;
			int tmp = numbers[1];
			numbers[1] = numbers[num];
			numbers[num] = tmp;
		}

		for (int i = 0; i < 6; i++) {
			lotto[i] = numbers[i + 1];
		}
		return lotto;
	}

	static int[] lotto4() {
		int[] lotto = new int[6];
		final int MAX_NUMBER = 45;
		int[] numbers = new int[MAX_NUMBER];
		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int idx = r.nextInt(MAX_NUMBER - i);

			lotto[i] = numbers[idx];
			numbers[idx] = numbers[MAX_NUMBER - i - 1];
		}

		return lotto;
	}
}
