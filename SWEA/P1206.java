package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 10; i++) {
			int answer = 0;
			int n = Integer.parseInt(br.readLine());
			int num[] = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n;  j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			for(int j = 2; j < n-2; j++) {
				if(num[j]> num[j+1] && num[j]> num[j-2] && num[j] > num[j-1]&& num[j] > num[j+2]) {
					answer += Math.min(Math.min(num[j] - num[j+1], num[j]-num[j-2]),Math.min(num[j] - num[j+2], num[j]-num[j-1]));
				}
			}
			System.out.println("#" + (i+1) + " " + answer);
		}
}
}
