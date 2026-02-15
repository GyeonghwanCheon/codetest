import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list  = new ArrayList <>();
        
        for(int i = 0; i < names.length; i++) {
            list.add(names[i]);
            i = i + 4;
        }
        
        return list.toArray(new String[0]);
    }
}