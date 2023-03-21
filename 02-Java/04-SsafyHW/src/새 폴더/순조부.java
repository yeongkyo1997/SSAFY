import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static int N, R;
	static int[] numbers, inputs;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();

		numbers = new int[R];
		inputs = new int[N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++)
			inputs[i] = sc.nextInt();

		System.out.println("순열");
		perm(0);
		System.out.println("조합");
		comb(0, 0);
		System.out.println("부분집합-재귀");
		sub(0);
		System.out.println("부분집합-비트연산");
		sub();
	}

	private static void sub() {
		for (int i = 0; i < (1 << N); i++) {
			for (int j = 0; j < N; j++) {
				if((i & (1 << j)) == 0) continue;
				System.out.print(inputs[j]);
			}
			System.out.println();
		}

	}

	private static void sub(int cnt) {
		if(cnt == N) {
			for(int i = 0; i < N; i++) {
				if(!visited[i]) continue;
				System.out.print(inputs[i] + " ");
			}
			System.out.println();
			return;
		}
		visited[cnt] = true;
		sub(cnt + 1);
		visited[cnt] = false;
		sub(cnt + 1);
	}

	private static void comb(int cnt, int start) {
		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for (int i = start; i < N; i++) {
			numbers[cnt] = inputs[i];
			comb(cnt + 1, i + 1);
		}
	}

	private static void perm(int cnt) {
		if (cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			numbers[cnt] = inputs[i];
			perm(cnt + 1);
			visited[i] = false;
		}
	}
}
