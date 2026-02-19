class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<my_string.length(); i += m) {
            char ch = my_string.charAt(i + c - 1);
            sb.append(ch);
        }
        
        
        return sb.toString();
    }
}