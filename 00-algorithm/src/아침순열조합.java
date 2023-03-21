import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 아침순열조합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int N, R;
	static int[] inputs, numbers;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		inputs = new int[N];
		numbers = new int[R];
		visited = new boolean[N];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			inputs[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println("순열");
		perm(0);
		System.out.println("===================");
		System.out.println("조합");
		comb(0, 0);
	}

	static void comb(int depth, int start) {
		if (depth == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = start; i < N; i++) {
			numbers[depth] = inputs[i];
			comb(depth + 1, i + 1);
		}
	}

	static void perm(int depth) {
		if (depth == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			numbers[depth] = inputs[i];
			visited[i] = true;
			perm(depth + 1);
			visited[i] = false;
		}
	}
}