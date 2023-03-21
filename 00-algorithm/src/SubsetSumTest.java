import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SubsetSumTest {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static boolean[] isSelected;
	static int N;
	static int S;
	static int[] input;

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		S = Integer.parseInt(br.readLine());
		bw.write("subset1\n");
		subset1(N);
		isSelected = new boolean[N];
		bw.write("subset2\n");
		subset2(0, 0);

		bw.close();
	}

	static void subset1(int n) throws IOException {
		for (int i = 1; i < (1 << n); i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					bw.write((j + 1) + " ");
				}
			}
			bw.write("\n");
		}
	}

	static void subset2(int depth, int idx) throws IOException {
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				if (isSelected[i]) {
					bw.write((i + 1) + " ");
				}
			}
			bw.write("\n");
			return;
		}
		isSelected[idx] = true;
		subset2(depth + 1, idx + 1);
		isSelected[idx] = false;
		subset2(depth + 1, idx + 1);
	}

	static void subSetSum(int cnt) throws IOException {
		if (cnt == N) {
			int sum = 0;

			for (int i = 0; i < N; i++) {
				if (isSelected[i])
					sum += input[i];
			}
			bw.write("\n");
		}
	}
}
