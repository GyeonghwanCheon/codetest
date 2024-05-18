class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a)+b;
        String ba = String.valueOf(b)+a;
        
        
        if(Integer.parseInt(ab)<Integer.parseInt(ba)) {
            answer = Integer.parseInt(ba);
        }
        else {
            answer = Integer.parseInt(ab);
        }
        
        return answer;
    }
}