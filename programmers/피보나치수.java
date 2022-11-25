class Solution {
    static int num[];
    public static int solution(int n) {
        int answer = 0;
        num = new int[n + 1];
        num[0] = 0;
        num[1] = 1;
        for(int i = 2; i <= n; i++){
            num[i] = (num[i-2]%1234567 + num[i-1]%1234567)%1234567;
        }

        return answer = num[n];
    }
}
