class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer1 = 0;
        int answer2 = 1;
        
        for(int i = 0; i<num_list.length; i++) {
            answer1 += num_list[i];
            answer2 *= num_list[i];
        }
        
        answer1 = answer1 * answer1;
        
        return answer = answer1 > answer2 ? 1 : 0;
    }
}