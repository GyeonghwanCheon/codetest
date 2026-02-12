class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = String.valueOf(num);
        String one = String.valueOf(k);
        
        for(int i = 0 ; i<str.length(); i++) {
            if(str.charAt(i) == one.charAt(0)) {
                return i + 1;
            }
        }
        
        return -1;
    }
}