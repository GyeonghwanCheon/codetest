import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        HashSet <Integer> set = new HashSet<>();
        for(int i : delete_list) {
            set.add(i);
        }
        
        
        ArrayList <Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}