import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1208 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		for (int t = 0; t < 10; t++) {
			int dump = Integer.parseInt(br.readLine());
			int[] list = new int[101];
			int high = Integer.MIN_VALUE;
			int low = Integer.MAX_VALUE;

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				int num = Integer.parseInt(st.nextToken());
				list[num]++;
				high = Math.max(high, num);
				low = Math.min(low, num);
			}

			while (high >= low) {
				if (dump-- == 0)
					break;
				list[high]--;
				list[high - 1]++;
				list[low]--;
				list[low + 1]++;
				while (list[high] <= 0)
					high--;
				while (list[low] <= 0)
					low++;
			}
			bw.write("#" + (t + 1) + " " + (high - low) + "\n");
		}
		bw.close();
	}
}
