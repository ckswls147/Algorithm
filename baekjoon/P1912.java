package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912{
	static Integer dp[];
	static int arr[];
	static int max;
	static int recur(int N) {
		if(dp[N] == null) {
			dp[N] = Math.max(arr[N], recur(N-1) + arr[N]);
		}
		max = Math.max(dp[N], max);
		return dp[N];
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dp = new Integer[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		max = arr[0];
		recur(n-1);
		System.out.print(max);
	}
}
