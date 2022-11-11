package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 10;
		
		for(int i = 0; i < t; i++) {
			int dump = Integer.parseInt(br.readLine());
			int box[] = new int[100];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 100; j++) {
				box[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(box);
			for(int j = 0; j < dump; j++) {
				box[0]++;
				box[99]--;
				Arrays.sort(box);
			}
			System.out.println("#" + (i+1) +" " + (box[99]-box[0]));
			
		}
}
}
