import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 모닝순조부 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, R;
	static int[] inputs, numbers;
	static boolean[] selected;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		numbers = new int[R];
		inputs = new int[N];
		selected = new boolean[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			inputs[i] = Integer.parseInt(st.nextToken());
		}
		bw.write("순열\n");
		perm(0);
		bw.write("조합\n");
		comb(0, 0);
		bw.write("부분집합 - 재귀\n");
		subset(0);
		bw.write("부분집합 - 비트\n");
		subset();
		bw.close();
	}

	static void subset() throws IOException {
		for (int i = 0; i < (1 << N); i++) {
			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) == 0)
					continue;

				bw.write(inputs[j] + " ");
			}
			bw.write("\n");
		}
	}

	static void subset(int cnt) throws IOException {
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				if (selected[i])
					continue;

				bw.write(inputs[i] + " ");
			}
			bw.write("\n");
			return;
		}
		selected[cnt] = true;
		subset(cnt + 1);
		selected[cnt] = false;
		subset(cnt + 1);
	}

	static void comb(int cnt, int start) {

	}

	static void perm(int cnt) {

	}
}
