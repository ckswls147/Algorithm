import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int length= (int) (Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
			
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				result[i] = -1;
			}
			else if(length > Math.pow(r1 + r2, 2)) {
				result[i] = 0;
				}
			else if(length < Math.pow(r1 - r2, 2)) {
				result[i] = 0;
			}
			else if(length == Math.pow(r1 + r2, 2)) {
				result[i] = 1;
				}
			else if(length == Math.pow(r1 - r2, 2)) {
				result[i] = 1;
				}
			
			else
				result[i] = 2;
			
			
		}
		for(int i = 0 ; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}
