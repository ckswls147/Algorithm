package chanjin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1107 {
	static int unable[];
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		unable = new int[m]; 
		String str = String.valueOf(n);
		int length = str.length();
		
		if(m != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				unable[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		int result = 0;
		if(n > 100) {
			result = n - 100;
		}
		else
			result = 100 - n;
		int temp = 0;
		
		
		for(int i = 0; i < 999999; i++) {
			str = String.valueOf(i);
			length = str.length();
			boolean equal = false;
			int a = 0;
			if(equal == false) {
				for(int j = 0; j < length; j++) {
					String s = String.valueOf(str.charAt(j));
					int num = Integer.parseInt(s);
					for(int k = 0; k < unable.length; k++) {
						if(num == unable[k]) {
							equal = true;
							break;
						}
					}
				}
			}
			if(equal == false){
				if(n >= i) {
					a = n - i;
				}
				else
					a = i - n;
				result = Math.min(result, a + length);
			}
			
		}
		System.out.print(result);
		
		
	}

}
