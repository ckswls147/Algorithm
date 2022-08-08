package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1931 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int meeting[][] = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			meeting[i][0] = Integer.parseInt(a);
			meeting[i][1] = Integer.parseInt(b);
		}

		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) { 
					return o1[0] - o2[0];
				}
				else { 
					return o1[1] - o2[1]; } }
			});
	
		int count = 1;
		int fin = meeting[0][1];
		boolean bool[] = new boolean[n];
		int a = 1;
		Queue queue = new LinkedList<>();
		while(true) {
			int t = 0;		
			int temp = 100000;
			for(int i = a; i < n; i++) {
				if(meeting[i][0] < fin) {
					bool[i] = false;
				}
				else {
					if(meeting[i][0] == meeting[i][1]) {
						count++;
						bool[i] = false;
					}
					else {
					queue.offer(i);
					bool[i] = true;
					}
				}
				
			}
			if(queue.isEmpty() == true) {
				break;
			}
			a = (int)queue.poll();
		
		for(int i = a; i < n; i++) {
			if(bool[i] == true && meeting[i][1] < temp) {
				fin = meeting[i][1];
				temp = fin;
				t = 1;
			}
		}

		count++;
		queue.clear();
		}

		System.out.print(count);

	}

}