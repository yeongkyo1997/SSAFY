import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1210 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int x, y;

	public static void main(String[] args) throws NumberFormatException, IOException {
		for (int t = 0; t < 10; t++) {
			int T = Integer.parseInt(br.readLine());
			int[][] list = new int[100][100];

			for (int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					list[i][j] = Integer.parseInt(st.nextToken());
					if (list[i][j] == 2) {
						x = i;
						y = j;
					}
				}
			}

			while (true) {
				if (x == 0) {
					bw.write("#" + T + " " + y + "\n");
					bw.flush();
					break;
				}

				if (y - 1 >= 0 && list[x][y - 1] == 1) {
					while (y - 1 >= 0 && list[x][y - 1] == 1) {
						y--;
					}
				} else if (y + 1 < 100 && list[x][y + 1] == 1) {
					while (y + 1 < 100 && list[x][y + 1] == 1) {
						y++;
					}
				}
				x--;
			}
		}
		bw.close();
	}
}
