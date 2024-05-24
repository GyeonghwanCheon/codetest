class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        
        for(int i=0; i<number.length(); i++) {
            total += number.charAt(i)-'0';    
        }
        
        
        return answer = total%9;
    }
}