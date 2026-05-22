import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            
            while (!list.isEmpty() && list.get(list.size() - 1) >= num) {
                list.remove(list.size() - 1);
            }
            
            list.add(num);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}