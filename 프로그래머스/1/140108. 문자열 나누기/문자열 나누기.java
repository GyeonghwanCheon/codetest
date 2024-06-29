class Solution {
    public int solution(String s) {
        int answer = 1;
        int a = 1;
        char ch = s.charAt(0);
        

        for(int i=1; i < s.length(); i++) {
            if (a == 0) {
                answer++;
                ch = s.charAt(i);
            }

            if (ch == s.charAt(i)) {
                a++;
            } else {
                a--;
            }
        }
        
        
        return answer;
    }
}