class Solution {
    public String solution(String code) {
        String answer = "";
        // mode = 0 일 땐 짝수 index 추가
        // mode = 1 일 땐 홀수 index 추가
        int mode = 0;
        
        for(int i = 0; i<code.length(); i++) {
            if(code.charAt(i) == '1'){
              mode = 1 - mode;
            }
            else if(i % 2 == mode) {
                answer += code.charAt(i);
            }
        }
    
        return "".equals(answer) ? "EMPTY" : answer;
    }
}