package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660 {
	static int n;
	static int t;
	static int arr[][];
	static int sum[];
	static int dp[][];
	static int seq(int x1, int y1, int x2, int y2) {
		int result = 0;
		if(x1 == x2) {
			for(int i = y1; i <= y2; i++) {
				result += arr[x1][i];
			}	
		}
		else {
			for(int i = y1; i <= y2; i++) {
				result += dp[x2][i] - dp[x1-1][i];
			}
		}
		return result;
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		arr = new int[n+1][n+1];
		dp = new int[n+1][n+1];
		dp[0][0] = 0;

		for(int i = 1; i <= n; i++) {
			dp[0][i] = 0;
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] += arr[i][j] + dp[i-1][j];
			}
			
		}
		
		sum = new int[t];
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			sum[i] = seq(x1, y1, x2, y2);
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(sum[i]);
		}
		
		
		
		
	}
}

