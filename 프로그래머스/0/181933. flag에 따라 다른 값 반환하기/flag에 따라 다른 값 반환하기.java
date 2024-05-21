class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        boolean i = true;
        
        answer = (flag == i ) ? a+b : a-b;
        return answer;
    }
}