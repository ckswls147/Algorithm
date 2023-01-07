import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        boolean tag = false;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            //태그가 아닐때
            if (!tag) {
                if (tmp.equals(" ")) {
                    for (int j = str.length() - 1; j >= 0; j--) {
                        sb.append(str.charAt(j));
                    }
                    sb.append(" ");
                    str = "";
                } else if (tmp.equals("<")) {
                    if (str.length() != 0) {
                        for (int j = str.length() - 1; j >= 0; j--) {
                            sb.append(str.charAt(j));
                        }
                    }
                    tag = true;
                    str = "<";
                } else {
                    str += tmp;
                }
                if (i == s.length() - 1) {
                    for (int j = str.length() - 1; j >= 0; j--) {
                        sb.append(str.charAt(j));
                    }
                }
            } // 태그일 때
            else {
                str += tmp;
                if (tmp.equals(">")) {
                    tag = false;
                    sb.append(str);
                    str = "";
                }
            }
        }
        String answer = sb.toString();
        System.out.println(answer);

    }
}
