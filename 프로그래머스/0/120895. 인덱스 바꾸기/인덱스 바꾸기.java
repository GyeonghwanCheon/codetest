class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        for(int i = 0; i<my_string.length(); i++) {
            
            if(num1 == i) {
                char c = my_string.charAt(num2);
                answer += c;
            } else if(num2 == i) {
                char c = my_string.charAt(num1);
                answer += c;
            } else {
                char c = my_string.charAt(i);
                answer += c;
            }
        }
        
        return answer;
    }
}