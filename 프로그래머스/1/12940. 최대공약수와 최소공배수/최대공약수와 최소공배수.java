class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 0;
        int n1 = n;
        int m1 = m;
        
        while(n1 > 0){
            a = m1 % n1;
            m1 = n1;
            n1 = a;
        }
        
        answer[0] = m1;
        answer[1] = n * m / answer[0];
        return answer;
    }
}