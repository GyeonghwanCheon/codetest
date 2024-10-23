import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        int sum = 0;
        int num = x;
        
        while(num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        
        for(int i = 0; i<list.size(); i++) {
            sum += list.get(i);    
        }
        
        return (x % sum == 0) ? true : false;
    }
}