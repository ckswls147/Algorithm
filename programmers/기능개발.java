import java.util.*;

class Solution {
    static int[] progresses = {95, 90, 99, 99, 80, 99}	;
    static int[] speeds = {1, 1,1,1,1,1};
    
    static int sol(int progress, int speed) {
        int day = 0;
        while (progress < 100) {
            progress += speed;
            day++;
        }
        return day;
    }

    static boolean check(int progress, int speed, int day) {
        if (progress + speed * day >= 100) {
            return true;
        }
        return false;
    }
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> st = new Stack();
        Queue<Integer> que = new LinkedList<>();
        for (int i = progresses.length - 1; i >= 0; i--) {
            st.add(i);
        }

        while (!st.isEmpty()) {
            int temp = st.pop();
            int day = sol(progresses[temp], speeds[temp]);
            int sum = 1;
            while (!st.isEmpty()) {
                temp = st.peek();
                if (check(progresses[temp], speeds[temp], day)) {
                    st.pop();
                    sum++;
                } else {
                    break;
                }
            }
            que.add(sum);
        }

        int size = que.size();
        int answer[] = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = que.poll();
            System.out.println(answer[i]);
        }
        return answer;
    }
}
