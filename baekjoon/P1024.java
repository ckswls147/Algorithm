package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1024 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		 
		int sum = 1;
		if(m>2) {
			for(int i = 2; i < m; i++) {
				sum += i;
			}
		}
		int cal = 0;
		int result = 0;
		int start = 0;
		int answer[] = {};
		while(true) {
			for(int i = 0; cal <= n; i++) {
				cal = i * m + sum;
				if(cal == n) {
					result = 1;
					start = i;
					break;
				}
			}
			if(result == 1) {
				answer = new int[m];
				for(int i= 0; i < m; i++) {
					answer[i] = start + i;
				}
				break;
			}
			if(m == 100) {
				break;
			}
			m++;
			sum += m-1;
			cal = 0;
		}
		
		if(result == 1) {
			for(int i = 0; i < m; i++)
				System.out.print(answer[i] + " ");
		}
		else
			System.out.print(-1);
		
		
	}

}
