import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = Math.abs(array[0] - n);
        int temp = 0;
        int num = 0;
        
        for(int i = 1; i < array.length; i++) {
            temp = Math.abs(array[i] - n);
             
            if(answer > temp) {
                answer = temp;
                num = i;
            } else if(temp == answer) {
                if(array[i] < array[num]) {
                    num = i;
                }
            }
        }
        
        
        return array[num];
    }
}