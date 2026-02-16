class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        answer[0] = k; 
        for(int i = 1; i < n/k; i++) {
            if(answer[i] < n) {
                answer[i] = answer[i - 1] + k;
            }
        }
        
        
        return answer;
    }
}