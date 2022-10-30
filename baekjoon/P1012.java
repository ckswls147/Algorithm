package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1012 {
	static int node[][];
	static boolean check[][];
	static int count;
	static int a, b, k;
	static int cx[] = {0, 0, 1, -1};
	static int cy[] = {1, -1, 0, 0};
	static int dx, dy;
	static void dfs(int x,int y) {
		check[x][y] =true;
		for(int i = 0; i < 4; i++) {
			dx = x + cx[i];
			dy = y + cy[i];
			if(dx >= 0 && dy >= 0 && dx < a && dy < b)
				if(check[dx][dy] == false && node[dx][dy] == 1) {
					dfs(dx,dy);
				}
		}

	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		int result[] = new int[t];
		count = 0;
		for(int i = 0; i < t; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			node = new int[a][b];
			check = new boolean[a][b];
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int q = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());
				node[q][w] = 1;
			}
			for(int j = 0; j < a; j++) {
				for(int n = 0; n < b; n++) {
					if(node[j][n] == 1 && check[j][n] == false) {
						dfs(j,n);
						count++;
					}
				}
			}
			
			result[i] = count;
		}
		for(int i = 0; i < t; i++) {
			System.out.println(result[i]);
		}
		
	}

}
