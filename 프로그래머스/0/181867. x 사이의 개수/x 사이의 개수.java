class Solution {
    public int[] solution(String myString) {
        String[] parts = myString.split("x", -1);  // -1을 주면 빈 문자열도 포함
        
        int[] answer = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }
        
        return answer;
    }
}