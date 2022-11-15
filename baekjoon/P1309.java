package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int[n+1];
		
		dp[1] = 3;
		dp[2] = 7;
		if(n >= 3) {
			for(int i = 3; i <= n; i++) {
				dp[i] = (dp[i-1]*2%9901 + dp[i-2]%9901)%9901;
			}
		}
		System.out.println(dp[n]);
	}
}
