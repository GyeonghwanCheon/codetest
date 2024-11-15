import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int first_max=0;
        int second_max=0;
        
        for(int i = 0; i < sizes.length; i++){
            int first = Math.max(sizes[i][0], sizes[i][1]);
            int second = Math.min(sizes[i][0], sizes[i][1]);
            first_max = Math.max(first_max, first);
            second_max = Math.max(second_max, second);
        }
        
        return answer = first_max * second_max;
    }
}