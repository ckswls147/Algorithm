package chanjin;

import java.util.Arrays;
import java.util.Scanner;

public class P1026{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		int max = 0;
		
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		int j = n-1;
		for(int i = 0; i < n; i++) {
			sum += a[i] * b[j];
			j--;
		}
		System.out.print(sum);
		
	}
}
