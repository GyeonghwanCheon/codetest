class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i=0; i<str1.length(); i++) {
        
            answer += "" + str1.charAt(i)+str2.charAt(i);
        }
        //String.valueOf를 사용하여 값을 String으로 형변환를 하나시켜도 됨.
        //""을 문자열 앞에 두고 더하면 str1이 문자열로 더해져 뒤에 str2도 문자열로 더해짐.
        
        return answer;
    }
}