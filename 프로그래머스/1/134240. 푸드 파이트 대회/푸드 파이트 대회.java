class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i<food.length; i++) {
            int count = food[i]/2;
            
            for(int j = 0; j<count; j++) {
                answer += Integer.toString(i);
            }
        }
        
        StringBuilder sb = new StringBuilder(answer);
        
        answer = sb.toString() + "0" + sb.reverse().toString();
    
        System.out.println(answer);
        
        return answer;
    }
}