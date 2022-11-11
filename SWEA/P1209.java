package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[][] = new int[101][101];
		for(int t = 0; t < 10; t++) {
			int result = 0;
			int result1 = 0;
			int result2 = 0;
			int test_num = Integer.parseInt(br.readLine());
			for(int i = 1; i < 101; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 1; j < 101; j++) {
					num[i][j] = Integer.parseInt(st.nextToken());
					int sum = 0;
					if(j == 100) {
						for(int k = 1; k <= 100; k++) {
							sum += num[i][k];
						}
						result = Math.max(sum, result);
						sum = 0;
					}
					if(i == 100) {
						for(int k = 1; k <= 100; k++) {
							sum += num[k][j];
						}
						result = Math.max(sum, result);
						sum = 0;
					}
					if(i+j == 101) {
						result1 += num[i][j];
					}
					if(i == j) {
						result2 += num[i][j];
					}
					
				
			}
			}
			result = Math.max(result, Math.max(result1, result2));
			System.out.println("#" + test_num + " " +result);
			
		}
}
}
