import java.util.*;

class Solution {
    public String[] solution(String my_string) {       
        String[] parts = my_string.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i<parts.length; i++) {
            if(parts[i].length() > 0) {
                list.add(parts[i]);
            }
        }
        
        
        return list.toArray(new String[0]);
    }
}