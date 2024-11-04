class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        String rev = "";
        
        System.out.println(Integer.toString(n,3));
        s = Integer.toString(n,3);
        
        for(int i = 0; i<s.length(); i++) {
            rev += s.charAt(s.length()-i-1);
        }
        
        answer = Integer.parseInt(rev, 3);
        
        
        return answer;
    }
}