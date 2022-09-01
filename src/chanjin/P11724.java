package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11724 {
	static int a, b, n, m;
	static int node[][];
	static boolean checked[];
	static int count;
	static void dfs(int N) {
		checked[N]= true;
		if(!checked[N]) {
			return;
		}
		for(int i = 1; i < n+1; i++) {
			if(node[N][i] == 1 && !checked[i]) {
				checked[i] = true;
				dfs(i);
			}
		}
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		node = new int[n+1][n+1];
		checked = new boolean[n+1];
		count = 0;
		int start = 0;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(i == 0) {
				start = a;
			}
			node[a][b] = 1;
			node[b][a] = 1;
		}

		for(int i = 1; i <= n; i++) {
			if(checked[i] == false) {
				dfs(i);
				count++;
			}
		}
		System.out.print(count);
		
		
	}

}
