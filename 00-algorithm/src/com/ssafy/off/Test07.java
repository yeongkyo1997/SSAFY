package com.ssafy.off;

public class Test07 {
	// n개 중 k개를 뽑는 조합의 경우의 수 계산을 재귀로 작성
	static long[][] dp;
	static final int MOD = 1000000007;

	static long combi(int n, int k) {
		if (k == 0 || n == k)
			return 1;

		if (dp[n - 1][k - 1] == 0)
			dp[n - 1][k - 1] = combi(n - 1, k - 1) % MOD;

		if (dp[n - 1][k] == 0)
			dp[n - 1][k] = combi(n - 1, k) % MOD;
		return dp[n - 1][k - 1] + dp[n - 1][k];
	}

	public static void main(String[] args) {
		int n = 100;
		int k = 50;
		dp = new long[n + 1][k + 1];
		System.out.println(combi(n, k));
	}
}
