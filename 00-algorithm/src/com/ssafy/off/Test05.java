package com.ssafy.off;

public class Test05 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		System.out.println(search(arr, 3, 0));
	}

	static int search(int[] arr, int key, int index) {
		if (index >= arr.length)
			return -1;
		if (arr[index] == key)
			return index;
		return search(arr, key, index + 1);
	}
}
