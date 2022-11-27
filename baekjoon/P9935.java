import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> que = new PriorityQueue<>();

        String s = br.readLine();
        String key = br.readLine();
        String fkey = String.valueOf(key.charAt(0));
        String str = s;
        while(true) {
            String ss = str;
            for (int i = 0; i < s.length() - key.length() + 1; i++) {
                String temp = String.valueOf(s.charAt(i));
                s = str;
                if (temp.equals(fkey) && str.length()- i >= key.length()) {
                    for (int j = 0; j < key.length(); j++) {
                        int len = str.length();
                        if (!String.valueOf(s.charAt(i + j)).equals(String.valueOf(key.charAt(j)))) {
                            break;
                        } else if (j == key.length() - 1) {
                            if (i == 0) {
                                str = s.substring(key.length(), str.length());
                            } else {
                                str = s.substring(0, i);
                                str += s.substring(i + key.length(), len);
                                len -= key.length();
                            }

                        }
                    }
                    if (str.equals("")) {
                        break;
                    }
                }
            }
            if (ss == str) {
                break;
            }

        }
        if (str.equals("")) {
            System.out.println("FRULA");
        }else{
            System.out.println(str);
        }

    }
}
