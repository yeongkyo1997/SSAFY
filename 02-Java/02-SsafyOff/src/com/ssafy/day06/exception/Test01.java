package com.ssafy.day06.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(1 / 0);
		Scanner sc = new Scanner(new File("a.txt"));
	}
}
