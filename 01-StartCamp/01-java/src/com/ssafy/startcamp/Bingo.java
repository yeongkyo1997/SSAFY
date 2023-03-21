package com.ssafy.startcamp;

import java.util.Scanner;

public class Bingo {
	static String[][] bingo;

	public static int bingoCheck() {
		int bingoCnt = 0;

		// 대각선 검사
		boolean flag = true;
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				if (!bingo[i][j].equals("*"))
					flag = false;
			}
			if (flag)
				bingoCnt++;

			for (int j = bingo[i].length; j > bingo[i].length; j++) {

			}
		}

		// 가로 검사
		flag = true;
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				if (!bingo[i][j].equals("*"))
					flag = false;
			}
			if (flag)
				bingoCnt++;
		}

		// 세로 검사
		flag = true;
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				if (!bingo[j][i].equals("*"))
					flag = false;
			}
			if (flag)
				bingoCnt++;
		}

		return bingoCnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("번호를 입력하세요 : ");
			String str = sc.next();

			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					if (bingo[i][j].equals(str))
						bingo[i][j] = "*";
				}
			}
		}
	}
}
