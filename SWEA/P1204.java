package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int score[] = new int[101];
			int testcase_num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 1000; j++) {
				score[Integer.parseInt(st.nextToken())]++;
			}
			int max = score[0];
			int maxidx = 0;
			for(int j = 1; j <= 100; j++) {
				if(max <= score[j]) {
					max = score[j];
					maxidx = j;
				}
			}
			System.out.println("#" + testcase_num + " " + maxidx);
		}
}
}
