import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int arr[];
	static Integer dp[];
	static int min;
	static int seq(int N) {
		if(dp[N] == null) {
			dp[N] = 1;
			for(int i = N-1; i >=0; i--) {
				if(arr[N] < arr[i]) {
					dp[N] = Math.max(seq(i) + 1, dp[N]);
				}
			}
		}
		min = Math.max(min, dp[N]);
		return dp[N];
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0 ; i < n ; i++) {
			seq(i);
		}
		
		System.out.print(min);
	}

}
