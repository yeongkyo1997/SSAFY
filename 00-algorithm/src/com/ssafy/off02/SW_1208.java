package com.ssafy.off02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW_1208 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		for (int t = 1; t <= 10; t++) {
			int n = Integer.parseInt(br.readLine());

			int[] list = new int[1001];
			int max = 1;
			int min = 100;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				int idx = Integer.parseInt(st.nextToken());
				list[idx]++;
				max = Math.max(max, list[i]);
				min = Math.min(min, list[i]);
			}

			while (max - min >= 1 || n-- > 0) {
				list[min]++;
				list[max]--;
				list[max + 1]++;

				while (list[min] == 0)
					min++;
				while (list[max] == 0)
					max--;
			}
			bw.write(list[max] - list[min] + "\n");
		}
		bw.close();
	}
}
