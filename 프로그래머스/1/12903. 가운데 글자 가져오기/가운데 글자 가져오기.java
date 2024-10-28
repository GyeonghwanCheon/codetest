class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = s.length();
        
    
        if(cnt % 2 == 0) {
            answer = s.substring(cnt/2-1, cnt/2+1);
            
        } else {
            answer = String.valueOf(s.charAt(cnt/2));
        }
        
        
        return answer;
    }
}