package com.ssafy.a_basic.array;

public class ArrayTest_20 {
	public static void main(String[] args) {

		char[][] grid = { { '2', '3', '1', '4' },
				{ '1', 'X', '3', '2' },
				{ '3', '4', 'X', 'X' },
				{ 'X', '4', '1', '5' } };

		int sum = 0;

		// TODO: X로 표시된 항목의 상좌우 숫자의 합을 구하시오.
		// 단 합을 구할 때 이미 더한 영역은 다시 더하지 않는다.
		int row = grid.length;
		int col = grid[0].length;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, -1, 0, 1 };
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 'X') {
					for (int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if (nx >= 0 && nx < row && ny >= 0 && ny < col && grid[nx][ny] != 'X') {
							sum += grid[nx][ny] - '0';
							grid[nx][ny] = 'X';
						}
					}
				}
			}
		}

		// END:
		System.out.println(sum);
	}
}
