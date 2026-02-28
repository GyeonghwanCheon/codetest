class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i = 0; i < order.length; i++) {
            char c = order[i].charAt(0);
            char c2 = order[i].charAt(3);
            if(c == 'a' || c2 == 'a') {
                answer += 4500;
            } else if(c == 'c' || c2 =='c') {
                answer += 5000;
            } 
        }
        
        return answer;
    }
}