import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < works.length; i++) {
            pq.add(works[i]);
        }
        
        while(n > 0) {
            int max = pq.poll();
            
            if(max == 0) {
                break;
            }
            
            max--;
            pq.add(max);
            n--;
        }
        
        long answer = 0;
        
        while(!pq.isEmpty()) {
            int num = pq.poll();
            answer += (long)num * num;
        }
        
        return answer;
    }
}