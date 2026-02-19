import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder answer = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        
        for(int idx : indices) {
            set.add(idx);
        }
        
        for(int i = 0; i < my_string.length(); i++) {
            if(!set.contains(i)) {
                answer.append(my_string.charAt(i));
            }
        }
        
        return answer.toString();
    }
}