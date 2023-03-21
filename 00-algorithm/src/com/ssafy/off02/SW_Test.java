package com.ssafy.off02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW_Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {

		for (int t = 0; t < 10; t++) {
			int T = Integer.parseInt(br.readLine());
			int[][] map = new int[100][100];

			for (int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int x = 0;
			int y = 0;
			for (int i = 0; i < 100; i++) {
				if (map[99][i] == 2) {
					x = 99;
					y = i;
				}
			}

			while (true) {
				if (x == 0) {
					bw.write(y + "\n");
					break;
				}
				if (map[x][y - 1] == 1 && y > 0)
					while (map[x][y - 1] != 1 && y - 1 >= 0)
						y--;
				else if (map[x][y + 1] == 1 && y+1 < 100)
					while (map[x][y + 1] != 1 && y + 1 < 100)
						y++;
				x--;
			}
			bw.close();
		}
	}
}
