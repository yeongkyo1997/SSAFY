package com.ssafy.day06.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("Test4.txt");
			br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();

				if (line == null)
					break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
