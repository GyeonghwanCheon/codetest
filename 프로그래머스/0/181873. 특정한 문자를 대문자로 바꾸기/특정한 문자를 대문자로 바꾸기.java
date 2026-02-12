class Solution {
    public String solution(String my_string, String alp) {
        
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            
            String one = String.valueOf(my_string.charAt(i));
            
            if (one.equals(alp)) {
                answer += one.toUpperCase();
            } else {
                answer += one;
            }
        }
        
        return answer;
    }
}