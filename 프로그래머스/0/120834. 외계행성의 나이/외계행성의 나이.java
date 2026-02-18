class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        
        String answer = "";
        
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';   // 문자 → 숫자
            answer += (char)(num + 'a');     // 숫자 → 문자
        }
        
        return answer;
    }
}