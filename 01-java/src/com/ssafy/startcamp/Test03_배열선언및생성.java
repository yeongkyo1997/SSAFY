package com.ssafy.startcamp;

public class Test03_배열선언및생성 {
	public static void main(String[] args) {
		int[] array;
		// The local variable array may not have been initialized
//		System.out.println(array);
		array = new int[3];

		array[0] = 1;
		array[1] = 10;
		array[2] = 100;

		char[] arr3 = new char[2];
		arr3[0] = 'a';
		arr3[1] = 'b';
	}
}
