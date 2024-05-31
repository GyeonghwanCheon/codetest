import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0, min = 0;
        
        for(int i=0; i<6; i++){
            if(lottos[i] == 0){
                max ++;
                }     
            for(int j=0; j<6; j++){      
                if(lottos[i] == win_nums[j]){
                max ++;
                min ++;
                }    
            }
        
        }
        Map<Integer, Integer> dic = new HashMap<>();
        dic.put(6,1);
        dic.put(5,2);
        dic.put(4,3);
        dic.put(3,4);
        dic.put(2,5);
        dic.put(1,6);
        dic.put(0,6);
        
        answer[0] = dic.get(max);
        answer[1] = dic.get(min);
        
        
        
        return answer ;
    }
}