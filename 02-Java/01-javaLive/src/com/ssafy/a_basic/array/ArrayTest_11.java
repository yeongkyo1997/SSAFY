package com.ssafy.a_basic.array;

public class ArrayTest_11 {
	public static void main(String[] args) {
		int[] intArray = { 3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54 };

		double avg = 0;
		int maxIdx = -1;
		int minIdx = -1;
		// TODO: 위 배열의 요소 중 평균(실수, 소숫점 세째에서 반올림 출력)과
		// 평균과 절대의 차이가 가장 큰값, 차이가 가장 작은 값을 출력하시오.
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		avg = (double) sum / intArray.length;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

		int maxDiff = Math.abs((int) avg - intArray[0]);
		int minDiff = Math.abs((int) avg - intArray[0]);

		for (int i = 0; i < intArray.length; i++) {
			int diff = (int) (avg - intArray[i]);
			diff = Math.abs(diff);
			if (maxDiff < diff) {
				maxDiff = diff;
				maxIdx = i;
			}
			if (minDiff > diff) {
				minDiff = diff;
				minIdx = i;
			}
		}

		// END:
		System.out.printf("avg:%.2f, maxDiff: %d, minDiff:%d%n", avg, intArray[maxIdx], intArray[minIdx]);

	}
}
