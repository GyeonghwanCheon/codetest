import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] num = s.split(" ");
        ArrayList <Integer> list = new ArrayList<>();
        
        for(String str : num) {
            if(str.equals("Z")) {
                list.remove(list.size() - 1);
            } else {
                list.add(Integer.parseInt(str));
            }
        } 
        
        for(int sum : list) {
            answer += sum;
        }
        
        return answer;
    }
}