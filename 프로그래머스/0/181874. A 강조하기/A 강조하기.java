class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char c = Character.toLowerCase(myString.charAt(i));
            
            if(c == 'a') {
                answer += 'A';
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}