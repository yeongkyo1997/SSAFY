package com.ssafy.day07.sort;

import java.util.Arrays;

public class Test02 {
	static class Data {
		int num;

		public Data(int num) {
			this.num = num;
		}

		@Override
		public String toString() {
			return "Data [num=" + num + "]";
		}

	}

	public static void main(String[] args) {
		Data d1 = new Data(4);
		Data d2 = new Data(2);
		Data d3 = new Data(8);
		Data d4 = new Data(6);
		Data d5 = new Data(9);
		Data[] data = { d1, d2, d3, d4, d5 };
		System.out.println("정렬 전: " + Arrays.toString(data));
		for (int i = 0; i < data.length; i++) {
			int minIdx = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].num > data[j].num) {
					minIdx = j;
				}
			}
			if (i == minIdx)
				continue;
			System.out.printf("위치 변경(%d, %d) : %s\n", i, minIdx, Arrays.toString(data));
			int tmp = data[i].num;
			data[i].num = data[minIdx].num;
			data[minIdx].num = tmp;
		}
		System.out.println("정렬 후: " + Arrays.toString(data));
	}
}
