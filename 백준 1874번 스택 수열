package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		int num[] = new int[n];
		String str[] = new String[n*2];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		int k = 0;
		int m = 0;
		for(int data = 1; data <= n; data++) {
			st.add(data);
			str[m] = "+";
			m++;
			while(st.peek()==num[k]){
				str[m] = "-";
				m++;
				st.pop();
				k++;
				if(st.isEmpty()) {
					break;
				}
			}
		}
		if(st.isEmpty()) {
			for(int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		}
		else
			System.out.print("NO");
		
		
	}

}
