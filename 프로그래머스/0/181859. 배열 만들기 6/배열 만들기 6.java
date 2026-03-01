import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            
            if (list.isEmpty()) {
                list.add(num);
            } else {
                int last = list.get(list.size() - 1);
                
                if (last == num) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(num);
                }
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}