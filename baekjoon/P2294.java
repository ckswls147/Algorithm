import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int coin[] = new int[n+1];
		int dp[] = new int[k+1];
		Arrays.fill(dp,100001);
		dp[0] = 0;
		
		
		for(int i = 1; i <= n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = coin[i]; j <= k; j++) {
					dp[j] = Math.min(dp[j], dp[j-coin[i]] + 1);
			}
		}
		System.out.print(dp[k] == 100001 ? -1 : dp[k]);
	
	}
}
