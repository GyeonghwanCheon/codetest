import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if(Math.sqrt(n) % 1 == 0.0) {
            double sqrt_num = Math.sqrt(n);
            answer = (long)Math.pow(sqrt_num+1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}