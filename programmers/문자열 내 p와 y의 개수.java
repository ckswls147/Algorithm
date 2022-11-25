class Solution {
    static boolean solution(String s) {
        boolean answer;

        s = s.toLowerCase();

        int pcnt = 0;
        int ycnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("p")){
                pcnt++;
            }
            else if(String.valueOf(s.charAt(i)).equals("y")){
                ycnt++;
            }

        }
        if (pcnt == ycnt) {
            answer = true;
        } else {
            answer = false;
        }


        return answer;
    }
}
