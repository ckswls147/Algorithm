package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14501 {
	static int day[];
	static int money[];
	static Integer dp[];
	static int max = 0;
	static int n;
	static int seq(int N) {
		if(dp[N] == null) {
			dp[N] = 0;
			if(day[N] + N <= n) {
				dp[N] = money[N];
				for(int i = N - 1; i >= 0; i--) {
					if(day[i] <= N-i) {
						dp[N] = Math.max(dp[i] + money[N], dp[N]);
					}
				}
			}
		}
		max = Math.max(max, dp[N]);
		return dp[N];
		
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		day = new int[n];
		money = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			day[i] = Integer.parseInt(st.nextToken());
			money[i] = Integer.parseInt(st.nextToken());
		}
		if(day[0] > n) {
			dp[0] = 0;
		}
		else
			dp[0] = money[0];
		
		for(int i = 0; i < n; i++) {
			seq(i);
		}
		System.out.println(max);
	}

}
