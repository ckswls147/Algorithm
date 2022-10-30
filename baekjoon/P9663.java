package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9663 {
	static int pick[];
	static int count = 0;
	static boolean visit[];
	static int n;
	static void queen(int n, int depth) {
		if(n == depth) {
			count++;
			return;
		}
		for(int i = 0; i < n; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				pick[depth] = i;
				if(check(depth)) {
					queen(n, depth+1);
				}
				visit[i] = false;
			}
		}
	}
	static boolean check(int cols) {
		for(int i = 0; i < cols; i++) {
			if(pick[cols] == pick[i]) {
				return false;
			}
			else if(Math.abs(cols - i) == Math.abs(pick[cols] - pick[i]))
				return false;
		}
		return true;
		
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		visit = new boolean[n];
		pick = new int[n];
		queen(n,0);
		System.out.print(count);
	}

}
