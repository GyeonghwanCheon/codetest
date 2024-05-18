class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0) {
            for(int i=1; i<n+1; i++) {
                if(i % 2 == 0){
                    answer += i*i;
                }
            }
        }
        
        else {
            for(int i=1; i<n+1; i++) {
                if(i % 2 != 0) {
                    answer += i;
                }
            }
        }
        
        /*
        for(int i = n; i >= 0; i -= 2)
                answer += (n % 2 == 0) ? i * i : i;
        */
        
        return answer;
    }
}