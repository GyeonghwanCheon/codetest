class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] gather = {"a", "e", "i", "o", "u"};
        
        for(String a : gather){
            answer = answer.replaceAll(a, "");
        }
        
        return answer;
    }
}