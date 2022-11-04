package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2156 {
	static int[] grape;
	static Integer[] dp;
	static int recur(int n) {
		if(dp[n] == null)
			dp[n] = Math.max(Math.max(recur(n-2),recur(n-3)+grape[n-1])+grape[n], recur(n-1));
		return dp[n];
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		grape = new int[n+1];
		for(int i = 1; i <= n; i++) {
			grape[i] = Integer.parseInt(br.readLine());
		}
		dp = new Integer[n+1];
		dp[0] = 0;
		dp[1] = grape[1];
		if(n>1)
			dp[2] = grape[1] + grape[2];
		System.out.print(recur(n));

	}

}
