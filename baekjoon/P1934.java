import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer[] = new int[t];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int aa = a;
            int bb = b;
            if (a < b) { // b가 a보다 크면
                while (true) {
                    if (b % a == 0) {
                        answer[i] = b;
                        break;
                    }
                    b += bb;
                }
            }
            if (b <= a) { // a가 b보다 크면
                while (true) {
                    if (a % b == 0) {
                        answer[i] = a;
                        break;
                    }
                    a += aa;
                }
            }
        }
        for (int val : answer) {
            System.out.println(val);
        }
    }
}
