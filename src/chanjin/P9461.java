package chanjin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9461 {
	static long num[] = new long[101];
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		num[0] = 0;
		num[1] = 1;
		num[2] = 1;
		num[3] = 1;
		num[4] = 2;
		num[5] = 2;
		int t = Integer.parseInt(br.readLine());
		int p[] = new int[t];
		for(int i = 0; i < t; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < t; i++) {
			bw.write(fib(p[i]) + "\n");
		}
		bw.flush();
		bw.close();
		
	}
	static long fib(int n) {
		if(num[n] == 0 && n != 0) {
			num[n] = fib(n-5) + fib(n-1);
		}
		return num[n];
	}

}
