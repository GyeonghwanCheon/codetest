class Solution {
    public String solution(String s) {
        String answer = "";
        char c1 = ' ';
        char c2 = ' ';
        int cnt = s.length();
        
    
        if(cnt % 2 == 0) {
            c1 = s.charAt(cnt/2 - 1);
            c2 = s.charAt(cnt/2);
            
            answer = String.valueOf(c1);
            answer += String.valueOf(c2);
            
        } else {
            answer = String.valueOf(s.charAt(cnt/2));
        }
        
        
        return answer;
    }
}