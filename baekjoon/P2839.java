import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int solution(int n) {
		int answer = -1;
		for(int i = 0; i <= n / 5; i++) {
			for(int j = 0; j <= n / 3; j++) {
				if(5*i + 3*j == n) {
					answer = i+j;
					break;
				}
			}
		}
		
		return answer;
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
	}

}
