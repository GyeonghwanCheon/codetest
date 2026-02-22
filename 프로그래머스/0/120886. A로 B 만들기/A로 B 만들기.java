import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] b1 = before.toCharArray();
        char[] b2 = after.toCharArray();
        
        Arrays.sort(b1);
        Arrays.sort(b2);
        
        return Arrays.equals(b1, b2) ? 1 : 0;
    }
}