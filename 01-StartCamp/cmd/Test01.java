package com.ssafy.day01;

import java.util.*;

public class  Test01{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum += sc.nextInt();
		System.out.print(sum);
		sc.close();		
	}
}