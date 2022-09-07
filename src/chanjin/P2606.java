package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2606 {
	static int node[][];
	static boolean check[];
	static int a,b,com,t,count;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        com = Integer.parseInt(br.readLine());
        t = Integer.parseInt(br.readLine());
        node = new int[com+1][com+1];
        check = new boolean[com+1];
        for(int i = 0; i < t ; i++) {
        	st = new StringTokenizer(br.readLine());
        	a = Integer.parseInt(st.nextToken());
        	b = Integer.parseInt(st.nextToken());
        	node[a][b] = 1;
        	node[b][a] = 1;
        }
        int start = 1;
        check[1] = true;
        System.out.print(bfs(start));
        
        
    }
    static int bfs(int x) {
    	Queue<Integer> que = new LinkedList<>();
    	que.add(1);
    	count = 0;
        while(true) {
        	if(que.isEmpty()) {
        		break;
        	}
        	x = que.poll();
        	for(int i = 1; i <= com; i++) {
    			if(node[x][i] == 1 && check[i] == false) {
    				que.add(i);
    				check[i] = true;
    				count++;
    			}
    		}
        }
        return count;
        
    }
}