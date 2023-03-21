package com.ssafy.day07.sort;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] data = { 4, 2, 8, 6, 9 };
		System.out.println("정렬 전: " + Arrays.toString(data));
		for (int i = 0; i < data.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					minIdx = j;
				}
			}
			if (i == minIdx)
				continue;
			System.out.printf("위치 변경(%d, %d) : %s\n", i, minIdx, Arrays.toString(data));
			int tmp = data[i];
			data[i] = data[minIdx];
			data[minIdx] = tmp;
		}
		System.out.println("정렬 후: " + Arrays.toString(data));
	}
}
